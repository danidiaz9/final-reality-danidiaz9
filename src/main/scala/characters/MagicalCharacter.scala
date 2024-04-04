package characters

class MagicalCharacter(val name: String,
                       var healthPoints: Int,
                       var defense:Int,
                       val weight: Double,
                       var manaPoints: Int) extends Characters {
  def getName: String = name
  def getHealthPoints: Int = healthPoints
  def getDefense: Int = defense
  def getWeight: Double = weight
  def getManaPoints: Int = manaPoints

}
