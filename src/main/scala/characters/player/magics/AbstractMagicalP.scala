package characters.player.magics

import characters.player.{AbstractPlayer, TraitPlayer}
import weaponry.{AbstractWeaponry, TraitWeaponry}

/** An abstract class representing a magical character in the game.
 *
 *  @constructor Creates a new magical character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the magical character.
 *  @param healthPoints The current health points of the magical character.
 *  @param defense The defense points of the magical character.
 *  @param weight The weight of the magical character.
 *  @param manaPoints The current mana points of the magical character.
 */

abstract class AbstractMagicalP(_name: String,
                                _healthPoints: Int,
                                _defense:Int,
                                _weight: Double,
                                var _manaPoints: Int,
                                _weapon: TraitWeaponry)
  extends AbstractPlayer(_name, _healthPoints, _defense, _weight, _weapon) {

}