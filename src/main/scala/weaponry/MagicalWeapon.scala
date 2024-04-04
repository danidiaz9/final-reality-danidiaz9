package weaponry

class MagicalWeapon(name: String,
                    attackPoints: Int,
                    weight: Double,
                    owner: Option[Character],
                    magicAttackPoints: Int) extends
  AbstractWeaponry(name, attackPoints, weight, owner) {

}
