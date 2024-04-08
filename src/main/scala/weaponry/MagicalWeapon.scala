package weaponry

/** A class representing a magical weapon in the game.
 *
 *  A magical weapon is a type of weapon that possesses magical properties, including additional
 *  magic attack points.
 *
 *  @param name The name of the magical weapon.
 *  @param attackPoints The attack points of the magical weapon.
 *  @param weight The weight of the magical weapon.
 *  @param owner The owner of the magical weapon, represented as an optional character.
 *  @param magicAttackPoints The magic attack points of the magical weapon.
 */
class MagicalWeapon(name: String,
                    attackPoints: Int,
                    weight: Double,
                    owner: Option[Character],
                    magicAttackPoints: Int) extends
                    AbstractWeaponry(name, attackPoints, weight, owner) {

}
