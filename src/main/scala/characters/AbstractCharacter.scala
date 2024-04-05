package characters

import weaponry.Weapon

abstract class AbstractCharacter(val name: String,
                        var healthPoints: Int,
                        var defense: Int,
                        val weight: Double) extends TCharacter {
  private var equipWeapon: Option[Weapon] = None

  def getName: String = name
  def getHealthPoints: Int = healthPoints
  def getDefense: Int = defense
  def getWeight: Double = weight
  
}
