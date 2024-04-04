package weaponry

trait TWeaponry {
  val name: String
  val attackPoints: Int
  val weight: Double
  var owner: Option[Character]
}
