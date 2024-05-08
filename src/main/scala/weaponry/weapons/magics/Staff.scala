package weaponry.weapons.magics

import characters.player.TraitPlayer

/** A class representing a staff magical weapon in the game.
 *
 *  A staff is a type of magical weapon that is used by spellcasters to enhance their magical abilities.
 *
 *  @constructor Creates a new instance of Staff with the specified attributes.
 *  @param _name The name of the staff.
 *  @param _attackPoints The attack points of the staff.
 *  @param _weight The weight of the staff.
 *  @param _owner The owner of the staff, represented as an optional character.
 *  @param _magicAttackPoints The magic attack points of the staff.
 */
class Staff (
            _name: String,
            _attackPoints: Int,
            _weight: Double,
            _owner: TraitPlayer,
            _magicAttackPoints: Int
          ) extends AbstractMagicalW (_name, _attackPoints, _weight, _owner, _magicAttackPoints) {

}