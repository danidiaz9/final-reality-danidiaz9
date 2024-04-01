package weaponry

abstract class AbstractWeaponry(
                                 val name: String,
                                 val attackPoints: Int,
                                 val weight: Double,
                                 val owner: String) extends TWeaponry {

  def getName: String = name
  def getAttackPoints: Int = attackPoints
  def getWeight: Double = weight
  def getOwner: String = name

}
