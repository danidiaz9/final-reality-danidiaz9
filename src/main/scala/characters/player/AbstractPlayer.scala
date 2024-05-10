package characters.player

import weaponry.TraitWeaponry

/** An abstract class representing a player-controlled character in the game.
 *
 *  @constructor Creates a new player with the specified name, health points, defense, weight, and weapon.
 *  @param _name The name of the player.
 *  @param _healthPoints The current health points of the player.
 *  @param _defense The defense points of the player.
 *  @param _weight The weight of the player.
 *  @param _weapon The weapon equipped by the player, represented as an optional trait weaponry.
 */
abstract class AbstractPlayer(val _name: String,
                              var _healthPoints: Int,
                              var _defense: Int,
                              val _weight: Double,
                              var _weapon: TraitWeaponry = Option[TraitWeaponry]
                             ) extends TraitPlayer {

  /** The action bar of the player. */
  var actionBar: Double = 0.0

  /** Returns the name of the player.
   *
   *  @return The name of the player.
   */
  def getName: String = _name

  /** Returns the current health points of the player.
   *
   *  @return The current health points of the player.
   */
  def getHealthPoints: Int = _healthPoints

  /** Returns the defense points of the player.
   *
   *  @return The defense points of the player.
   */
  def getDefense: Int = _defense

  /** Returns the weight of the player.
   *
   *  @return The weight of the player.
   */
  def getWeight: Double = _weight

  /** Returns the weapon equipped by the player.
   *
   *  @return The weapon equipped by the player.
   */
  def getWeapon: TraitWeaponry = _weapon

  /** Sets the weapon to be equipped by the player.
   *
   *  @param weapon The weapon to be equipped by the player.
   */
  protected def setWeapon(weapon: TraitWeaponry): Unit = {
    _weapon = weapon
  }

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
    val weaponWeight = this.getWeapon.getWeight
    val maxActionBar = charWeight + 0.5 * weaponWeight
    maxActionBar

  }

  def attack: Int = {
    if (this.getWeapon != null) {
      this.getWeapon.getAttackPoints
    }
    else {
      throw new Error("Players must have a weapon to attack.")
    }
  }

}
