package weaponry.weapons.magics

import characters.AbstractCharacter

class Staff (
            _name: String,
            _attackPoints: Int,
            _weight: Double,
            _owner: AbstractCharacter = _,
            _magicAttackPoints: Int
          ) extends AbstractMagicalW (_name, _attackPoints, _weight, _owner, _magicAttackPoints) {

}