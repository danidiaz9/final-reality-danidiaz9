package characters.player.commons

import characters.player.TraitPlayer
import weaponry.{AbstractWeaponry, TraitWeaponry}

/** An abstract class representing a common character in the game.
 *
 *  @constructor Creates a new common character with the specified name, health points, defense, and weight.
 *  @param name The name of the common character.
 *  @param healthPoints The current health points of the common character.
 *  @param defense The defense points of the common character.
 *  @param weight The weight of the common character.
 */
abstract class AbstractCommonP(val _name: String,
                               var _healthPoints: Int,
                               var _defense: Int,
                               val _weight: Double,
                               var _weapon: TraitWeaponry = _) extends TraitPlayer {

  /** The weapon equipped by the common character. */
 def equipWeapon: TraitWeaponry = _weapon

  /** Returns the name of the common character. */
  def getName: String = _name

  /** Returns the current health points of the common character. */
  def getHealthPoints: Int = _healthPoints

  /** Returns the defense points of the common character. */
  def getDefense: Int = _defense

  /** Returns the weight of the common character. */
  def getWeight: Double = _weight

 def getWeapon: TraitWeaponry = _weapon

  //def getActionPoints: Double = 0.0

//  def getActionBar: Double = weight + 0.5*Weapon.getWeight

}
