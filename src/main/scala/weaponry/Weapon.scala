package weaponry

/** A class representing a weapon in the game.
 *
 *  A weapon is an object used to inflict damage or harm to opponents in the game.
 *
 *  @param name The name of the weapon.
 *  @param attackPoints The attack points of the weapon.
 *  @param weight The weight of the weapon.
 *  @param owner The owner of the weapon, represented as an optional character.
 */
class Weapon(name: String,
             attackPoints: Int,
             weight: Double,
             owner: Option[Character]) extends
             AbstractWeaponry(name, attackPoints, weight, owner) {

}
