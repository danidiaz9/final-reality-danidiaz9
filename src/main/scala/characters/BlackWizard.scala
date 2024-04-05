package characters

import weaponry.MagicalWeapon

 class BlackWizard(name: String,
                  healthPoints: Int,
                  defense: Int,
                  weight: Double,
                  manaPoints: Int) extends
  MagicalCharacter(name, healthPoints, defense, weight, manaPoints) {

  var equipMagicWeapon: Null = _
}
