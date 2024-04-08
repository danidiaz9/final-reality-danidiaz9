package characters.common

/** A class representing a paladin character in the game.
 *
 *  @constructor Creates a new paladin character with the specified name, health points, defense, and weight.
 *  @param name The name of the paladin character.
 *  @param healthPoints The current health points of the paladin character.
 *  @param defense The defense points of the paladin character.
 *  @param weight The weight of the paladin character.
 */
class Paladin(name: String,
              healthPoints: Int,
              defense: Int,
              weight: Double) extends
  AbstractCommon(name, healthPoints, defense, weight) {

  /** The weapon equipped by the paladin character. */
  var equipWeapon: Null = _

}
