package characters.player

import weaponry.TraitWeaponry

abstract class AbstractPlayer(val _name: String,
                              var _healthPoints: Int,
                              var _defense: Int,
                              val _weight: Double,
                              var _weapon: TraitWeaponry = Option[TraitWeaponry]
                             ) extends TraitPlayer {

  var actionBar: Double = 0.0

  /** Returns the name of the common character. */
  def getName: String = _name

  /** Returns the current health points of the common character. */
  def getHealthPoints: Int = _healthPoints

  /** Returns the defense points of the common character. */
  def getDefense: Int = _defense

  /** Returns the weight of the common character. */
  def getWeight: Double = _weight

  def getWeapon: TraitWeaponry = _weapon

  protected def setWeapon(weapon: TraitWeaponry): Unit = {
    _weapon = weapon
  }

  def getActionBar: Double = actionBar

  def calculateMaxActionBar: Double = {
    val charWeight = this.getWeight
    val weaponWeight = this.getWeapon.getWeight
    val maxActionBar = charWeight + 0.5 * weaponWeight
    maxActionBar

  }

}
