package weaponry.weapons.magicals

import characters.AbstractCharacter

class Wand (
              _name: String,
              _attackPoints: Int,
              _weight: Double,
              _owner: AbstractCharacter = _,
              _magicAttackPoints: Int
            ) extends AbstractMagical (_name, _attackPoints, _weight, _owner, _magicAttackPoints) {

}