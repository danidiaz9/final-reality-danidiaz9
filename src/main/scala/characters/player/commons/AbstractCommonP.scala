package characters.player.commons

import characters.player.AbstractPlayer
import weaponry.TraitWeaponry

/** An abstract class representing a common player character in the game.
 *
 *  @constructor Creates a new common player character with the specified name, health points, defense, and weight.
 *  @param _name The name of the common player character.
 *  @param _healthPoints The current health points of the common player character.
 *  @param _defense The defense points of the common player character.
 *  @param _weight The weight of the common player character.
 *  @param _weapon The weapon equipped by the common player character.
 */
abstract class AbstractCommonP(_name: String,
                               _healthPoints: Int,
                               _defense: Int,
                               _weight: Double,
                               _weapon: TraitWeaponry)
  extends AbstractPlayer(_name, _healthPoints, _defense, _weight, _weapon)  {


}
