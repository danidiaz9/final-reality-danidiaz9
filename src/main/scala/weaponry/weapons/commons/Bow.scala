package weaponry.weapons.commons

import characters.player.TraitPlayer

/** A class representing a bow weapon in the game.
 *
 *  A bow is a type of weapon used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of Bow with the specified attributes.
 *  @param _name The name of the bow.
 *  @param _attackPoints The attack points of the bow.
 *  @param _weight The weight of the bow.
 *  @param _owner The owner of the bow, represented as an optional character.
 */
class Bow (
            _name: String,
            _attackPoints: Int,
            _weight: Double,
            _owner: TraitPlayer
          ) extends AbstractCommonW (_name, _attackPoints, _weight, _owner) {

}