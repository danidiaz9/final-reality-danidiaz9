package characters.common

/** A class representing a warrior character in the game.
 *
 *  @constructor Creates a new warrior character with the specified name, health points, defense, and weight.
 *  @param name The name of the warrior character.
 *  @param healthPoints The current health points of the warrior character.
 *  @param defense The defense points of the warrior character.
 *  @param weight The weight of the warrior character.
 */
class Warrior(name: String,
              healthPoints: Int,
              defense: Int,
              weight: Double) extends
  AbstractCommon(name, healthPoints, defense, weight) {

  /** The weapon equipped by the warrior character. */
  var equipWeapon: Null = _

}
