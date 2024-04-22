package weaponry.weapons.commons

import characters.AbstractCharacter

class Axe (
          _name: String,
          _attackPoints: Int,
          _weight: Double,
          _owner: AbstractCharacter = _
          ) extends AbstractCommon (_name, _attackPoints, _weight, _owner) {

}
