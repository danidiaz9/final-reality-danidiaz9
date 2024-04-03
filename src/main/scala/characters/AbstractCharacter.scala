package characters

abstract class AbstractCharacter(
                                  val name: String,
                                  var healthPoints: Int,
                                  var defense: Int,
                                  val weight: Double) extends TCharacters {
  def getName: String = name
  def getHealthPoints: Int = healthPoints
  def getDefense: Int = defense
  def getWeight: Double = weight

}
