package spells.dark

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.BlackMage

class Thunder extends AbstractDarkSpell {

  override val manaCost: Int = 20

  override def setSpellBlackMage(blackMage: BlackMage): Unit = {
    blackMage.equipThunder(this)
  }

  override def applySpell(target: GameUnit, from: Character): Unit = {
    target.receiveAttack(from.getWeapon.get.magicAttackPoints)
  }

}
