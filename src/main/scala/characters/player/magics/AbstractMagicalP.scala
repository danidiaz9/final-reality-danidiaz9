package characters.player.magics

import characters.player.AbstractPlayer
import weaponry.TraitWeaponry

/** An abstract class representing a magical character in the game.
 *
 *  @constructor Creates a new magical character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param _name The name of the magical character.
 *  @param _healthPoints The current health points of the magical character.
 *  @param _defense The defense points of the magical character.
 *  @param _weight The weight of the magical character.
 *  @param _manaPoints The current mana points of the magical character.
 *  @param _weapon The weapon equipped by the magical character.
 */

abstract class AbstractMagicalP(_name: String,
                                _healthPoints: Int,
                                _defense:Int,
                                _weight: Double,
                                var _manaPoints: Int,
                                _weapon: TraitWeaponry)
  extends AbstractPlayer(_name, _healthPoints, _defense, _weight, _weapon) {

}