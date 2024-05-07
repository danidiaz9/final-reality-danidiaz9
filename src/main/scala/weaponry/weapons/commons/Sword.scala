package weaponry.weapons.commons

import characters.player.TraitPlayer

/** A class representing a sword weapon in the game.
 *
 *  A sword is a type of weapon used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of Sword with the specified attributes.
 *  @param _name The name of the sword.
 *  @param _attackPoints The attack points of the sword.
 *  @param _weight The weight of the sword.
 *  @param _owner The owner of the sword, represented as an optional character.
 */
class Sword (
            _name: String,
            _attackPoints: Int,
            _weight: Double,
            _owner: TraitPlayer = _
          ) extends AbstractCommonW (_name, _attackPoints, _weight, _owner) {

}