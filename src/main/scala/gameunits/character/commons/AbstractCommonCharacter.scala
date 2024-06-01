package gameunits.character.commons

import gameunits.character.AbstractCharacter
import weapons.Weapon

/** An abstract class representing a common character character in the game.
 *
 *  @constructor Creates a new common character character with the specified name, health points, defense, and weight.
 *  @param name The name of the common character character.
 *  @param currentHealthPoints The current health points of the common character character.
 *  @param defense The defense points of the common character character.
 *  @param weight The weight of the common character character.
 *  @param weapon The weapons equipped by the common character character.
 */
abstract class AbstractCommonCharacter(name: String,
                                       maxHealthPoints: Int,
                                       currentHealthPoints: Int,
                                       defense: Int,
                                       weight: Double,
                                       weapon: Option[Weapon])
  extends AbstractCharacter(name, maxHealthPoints, currentHealthPoints, defense, weight, weapon)  {


}
