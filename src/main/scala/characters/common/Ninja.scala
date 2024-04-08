package characters.common

/** A class representing a ninja character in the game.
 *
 *  @constructor Creates a new ninja character with the specified name, health points, defense, and weight.
 *  @param name The name of the ninja character.
 *  @param healthPoints The current health points of the ninja character.
 *  @param defense The defense points of the ninja character.
 *  @param weight The weight of the ninja character.
 */
class Ninja(name: String,
            healthPoints: Int,
            defense: Int,
            weight: Double) extends
  AbstractCommon(name, healthPoints, defense, weight) {

  /** The weapon equipped by the ninja character. */
  var equipWeapon: Null = _

}
