package characters.player

import weaponry.Weapon
import weaponry.weapons.commons.{Axe, Bow, Sword}
import weaponry.weapons.magics.{Staff, Wand}

/** An abstract class representing a player-controlled character in the game.
 *
 *  @constructor Creates a new player with the specified name, health points, defense, weight, and weapon.
 *  @param name The name of the player.
 *  @param healthPoints The current health points of the player.
 *  @param defense The defense points of the player.
 *  @param weight The weight of the player.
 *  @param weapon The weapon equipped by the player, represented as an optional trait weaponry.
 */
abstract class AbstractCharacter(val name: String,
                                 private var healthPoints: Int,
                                 private var defense: Int,
                                 val weight: Double,
                                 private var weapon: Option[Weapon] = None
                             ) extends Character {
  
  /** The action bar of the player. */
  var actionBar: Double = 0.0

  /** Returns the name of the player.
   *
   *  @return The name of the player.
   */
  def getName: String = name

  /** Returns the current health points of the player.
   *
   *  @return The current health points of the player.
   */
  def getHealthPoints: Int = healthPoints

  /** Sets the health points of the player to the specified value.
   *
   *  @param x The value to set the health points to.
   */
  def setHealthPoints(x: Int): Unit = {
    healthPoints = x
  }

  /** Returns the defense points of the player.
   *
   *  @return The defense points of the player.
   */
  def getDefense: Int = defense

  /** Returns the weight of the player.
   *
   *  @return The weight of the player.
   */
  def getWeight: Double = weight

  /** Returns the weapon equipped by the player.
   *
   *  @return The weapon equipped by the player.
   */
  def getWeapon: Option[Weapon] = weapon

  /** Sets the weapon to be equipped by the player.
   *
   *  @param w The weapon to be equipped by the player.
   */
  def setWeapon(w: Weapon): Unit = {
   weapon = Some(w)
   w.setOwner(this)
  }

  def equipAxe(axe: Axe): Unit = throw new InvalidEquipException()

  def equipBow(bow: Bow): Unit = throw new InvalidEquipException()

  def equipSword(sword: Sword): Unit = throw new InvalidEquipException()

  def equipWand(wand: Wand): Unit = throw new InvalidEquipException()

  def equipStaff(staff: Staff): Unit = throw new InvalidEquipException()

  /** Returns the action bar of the player.
   *
   *  @return The action bar of the player.
   */
  def getActionBar: Double = actionBar

  /** Calculates the maximum action bar of the player.
   *
   *  @return The maximum action bar of the player.
   */
  def calculateMaxActionBar: Double = {
    val charWeight = this.getWeight
    val weaponWeight = this.getWeapon.get.getWeight
    val maxActionBar = charWeight + 0.5 * weaponWeight
    maxActionBar

  }

  /** Returns the attack points of the player.
   *
   *  @return The attack points of the player.
   */
  def attack: Int = {
    if (this.getWeapon.isDefined) {
      this.getWeapon.get.getAttackPoints
    }
    else {
      println("Error: Players must have a weapon to attack.")
      -1
    }
  }

}
