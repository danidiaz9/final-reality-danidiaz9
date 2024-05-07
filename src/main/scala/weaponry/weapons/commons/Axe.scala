package weaponry.weapons.commons

import characters.player.TraitPlayer

/** A class representing an axe weapon in the game.
 *
 *  An axe is a type of weapon used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of Axe with the specified attributes.
 *  @param _name The name of the axe.
 *  @param _attackPoints The attack points of the axe.
 *  @param _weight The weight of the axe.
 *  @param _owner The owner of the axe, represented as an optional character.
 */
class Axe (
            _name: String,
            _attackPoints: Int,
            _weight: Double,
            _owner: TraitPlayer = _
          ) extends AbstractCommonW (_name, _attackPoints, _weight, _owner) {

}
