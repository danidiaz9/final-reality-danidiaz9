package characters

import scala.collection.mutable.ArrayBuffer

trait TCharacter {
  val name: String
  var healthPoints: Int
  var defense: Int
  val weight: Double
}
