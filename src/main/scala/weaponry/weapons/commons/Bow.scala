package weaponry.weapons.commons

import characters.AbstractCharacter

class Bow (
            _name: String,
            _attackPoints: Int,
            _weight: Double,
            _owner: AbstractCharacter = _
          ) extends AbstractCommonW (_name, _attackPoints, _weight, _owner) {

}