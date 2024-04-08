package characters

/** A class representing an enemy character in the game.
 *
 *  @constructor Creates a new enemy with the specified name, health points, attack points, defense, and weight.
 *  @param name The name of the enemy.
 *  @param healthPoints The current health points of the enemy.
 *  @param attackPoints The attack points of the enemy.
 *  @param defense The defense points of the enemy.
 *  @param weight The weight of the enemy.
 */
class Enemy(name: String,
            healthPoints: Int,
            attackPoints: Int,
            defense: Int,
            weight: Double) extends
  AbstractCharacter(name, healthPoints, defense, weight) {

}
