package characters

import scala.collection.mutable.ArrayBuffer

class Party {
  val characters: ArrayBuffer[TCharacter] = new ArrayBuffer()
  private var partyHealthPoints: Int = 0
  def addCharacter(c: TCharacter): Unit = {
    characters += c
  }
  def partyHealthPoints(): Int = {
    var healthPoints:Int = 0
    for (character <- characters) {
      var healthPoints:Int = character.getHealthPoints
      partyHealthPoints += healthPoints
    }
    if (partyHealthPoints = 0) {
      println("Defeated Party")
    }
  }
} 
