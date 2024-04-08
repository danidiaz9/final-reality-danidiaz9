package characters.magic

 class BlackWizard(name: String,
                  healthPoints: Int,
                  defense: Int,
                  weight: Double,
                  manaPoints: Int) extends
  AbstractMagical(name, healthPoints, defense, weight, manaPoints) {

  var equipMagicWeapon: Null = _
}
