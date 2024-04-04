package characters

class Enemy(name: String,
            healthPoints: Int,
            attackPoints: Int,
            defense: Int,
            weight: Double) extends
  Character(name, healthPoints, defense, weight) {

}
