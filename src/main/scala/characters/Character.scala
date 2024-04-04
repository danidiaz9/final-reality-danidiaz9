package characters

class Character(val name: String,
                          var healthPoints: Int,
                          var defense: Int,
                          val weight: Double) extends Characters {
  def getName: String = name
  def getHealthPoints: Int = healthPoints
  def getDefense: Int = defense
  def getWeight: Double = weight
  
}
