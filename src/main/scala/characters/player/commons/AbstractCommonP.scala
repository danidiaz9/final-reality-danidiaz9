package characters.player.commons

import characters.TraitCharacter
import characters.player.{AbstractPlayer, TraitPlayer}
import weaponry.TraitWeaponry

/** An abstract class representing a common character in the game.
 *
 *  @constructor Creates a new common character with the specified name, health points, defense, and weight.
 *  @param name The name of the common character.
 *  @param healthPoints The current health points of the common character.
 *  @param defense The defense points of the common character.
 *  @param weight The weight of the common character.
 */
abstract class AbstractCommonP(_name: String,
                               _healthPoints: Int,
                               _defense: Int,
                               _weight: Double,
                               _weapon: TraitWeaponry)
  extends AbstractPlayer(_name, _healthPoints, _defense, _weight, _weapon)  {


}
