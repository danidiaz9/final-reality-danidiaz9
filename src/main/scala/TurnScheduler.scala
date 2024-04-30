
import characters.TraitCharacter
import characters.player.TraitPlayer

import scala.collection.mutable.ArrayBuffer

class TurnScheduler {

  private var loadingZone: ArrayBuffer[TraitPlayer] = new ArrayBuffer()
  private var waitingZone: ArrayBuffer[TraitPlayer] = new ArrayBuffer()

  def addLoadingZone(c: TraitPlayer): Unit = {
    loadingZone += c
  }

  def removeLoadingZone(c: TraitPlayer): Unit = {
    loadingZone -= c
  }

  def addWaitingZone(c: TraitPlayer): Unit = {
    waitingZone += c
  }

  def removeWaitingZone(c: TraitPlayer): Unit = {
    waitingZone -= c
  }

  def calculateMaxActionBarC(c: TraitPlayer): Double = {
    val charWeight = c.getWeight
    val weaponWeight = c.getWeapon.getWeight
    val maxActionBarC = charWeight + 0.5 * weaponWeight
    maxActionBarC

  }

  def calculateMaxActionBarE(e: TraitCharacter): Double = {
    val enemyWeight = e.getWeight
    val maxActionBarE = enemyWeight
    maxActionBarE

  }

  def resetActionBar: Unit = {

  }

  //def increaseActionPoints(amount: Double): Unit = {
    loadingZone.foreach(_.actionPoints += amount)
  }

}
