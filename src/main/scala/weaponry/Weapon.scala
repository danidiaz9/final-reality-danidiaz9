package weaponry

class Weapon(name: String,
             attackPoints: Int,
             weight: Double,
             owner: Option[Character]) extends
             AbstractWeaponry(name, attackPoints, weight, owner) {

}
