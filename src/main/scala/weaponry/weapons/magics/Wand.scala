package weaponry.weapons.magics

import characters.player.TraitPlayer

/** A class representing a wand magical weapon in the game.
 *
 *  A wand is a type of magical weapon that is commonly used by spellcasters to channel their magical abilities.
 *
 *  @constructor Creates a new instance of Wand with the specified attributes.
 *  @param _name The name of the wand.
 *  @param _attackPoints The attack points of the wand.
 *  @param _weight The weight of the wand.
 *  @param _owner The owner of the wand, represented as an optional character.
 *  @param _magicAttackPoints The magic attack points of the wand.
 */
class Wand (
              _name: String,
              _attackPoints: Int,
              _weight: Double,
              _owner: TraitPlayer,
              _magicAttackPoints: Int
            ) extends AbstractMagicalW (_name, _attackPoints, _weight, _owner, _magicAttackPoints) {

}