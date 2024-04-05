package characters

class Paladin(name: String,
              healthPoints: Int,
              defense: Int,
              weight: Double) extends
  AbstractCharacter(name, healthPoints, defense, weight) {

  var equipWeapon: Null = _

}
