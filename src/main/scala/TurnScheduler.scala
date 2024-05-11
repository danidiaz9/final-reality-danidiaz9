import characters.TraitCharacter
import characters.player.TraitPlayer

import scala.collection.mutable.ArrayBuffer

/** A class representing a turn scheduler in the game.
 *
 *  This class manages the turn order of characters during combat by handling their action bars.
 */
class TurnScheduler {

  /** The loading zone where characters wait for their action bars to fill up. */
  private val loadingZone: ArrayBuffer[TraitCharacter] = new ArrayBuffer()

  /** The waiting zone where characters with filled action bars wait for their turn. */
  private val waitingZone: ArrayBuffer[TraitCharacter] = new ArrayBuffer()

  /** Adds a character to the loading zone.
   *
   *  @param c The character to add to the loading zone.
   */
  def addLoadingZone(c: TraitCharacter): Unit = {
    loadingZone += c
  }

  /** Removes a character from the loading zone.
   *
   *  @param c The character to remove from the loading zone.
   */
  def removeLoadingZone(c: TraitCharacter): Unit = {
    loadingZone -= c
  }

  /** Adds a character to the waiting zone.
   *
   *  @param c The character to add to the waiting zone.
   */
  private def addWaitingZone(c: TraitCharacter): Unit = {
    waitingZone += c
  }

  /** Removes a character from the waiting zone.
   *
   *  @param c The character to remove from the waiting zone.
   */
  def removeWaitingZone(c: TraitCharacter): Unit = {
    waitingZone -= c
  }

  /** Returns the actual action bar value of a character.
   *
   *  @param c The character whose action bar value to retrieve.
   *  @return The difference between the character's current action bar and its maximum action bar.
   */
  def excessActionBar(c: TraitCharacter): Double = {
     c.getActionBar - c.calculateMaxActionBar
  }

  /** Updates the action bar of a character.
   *
   *  @param c The character whose action bar to update.
   *  @param k The amount to increase the character's action bar by.
   */
  private def updateActionBar(c: TraitCharacter, k: Int): Unit = {
    c.actionBar += k
  }

  /** Resets the action bar of a character to zero.
   *
   *  @param c The character whose action bar to reset.
   *  @return The new action bar value, which is always 0.0.
   */
  private def resetActionBar(c: TraitCharacter): Double ={
    c.actionBar = 0.0
    c.actionBar
  }

  /** Resets the action bars of all characters in the waiting zone to zero. */
  def resetActionBarInstance(): Unit = {
    for (c <- waitingZone){
      resetActionBar(c)
    }
  }

  /** Updates the action bars of all characters in the loading zone.
   *
   *  @param k The amount to increase each character's action bar by.
   */
  def updateLoadingZone(k: Int): Unit = {
    for (c <- loadingZone){
      updateActionBar(c,k)
    }
  }

  /** Completes the action bars of characters in the loading zone and moves them to the waiting zone. */
  def completeActionBar(): Unit = {
    val turns: ArrayBuffer[TraitCharacter] = new ArrayBuffer()
    for (c <- loadingZone) {
      addWaitingZone(c)
    }
    for (c <- waitingZone) {
      if (c.getActionBar >= c.calculateMaxActionBar) {
        turns += c
      }
    }
  }

  // TODO: Define turn handling logic
  val turns: Unit = {

  }

  def combatPlayer(player: TraitPlayer, enemy: TraitCharacter): Unit = {

    val playerDamage = player.attack - enemy.getDefense
    enemy.setHealthPoints(enemy.getHealthPoints - playerDamage)

    if (enemy.getHealthPoints > 0) {
      println(s"Damage inflicted: $playerDamage")
    }
    else {
      println(s"${enemy.getName} defeated")
    }

  }

  def combatEnemy(enemy: TraitCharacter, player: TraitPlayer): Unit = {

    val enemyDamage = enemy.attack - player.getDefense
    player.setHealthPoints(player.getHealthPoints - enemyDamage)

    if (player.getHealthPoints > 0) {
      println(s"Damage inflicted: $enemyDamage")
    }
    else {
      println(s"${player.getName} defeated")
    }

  }

}
