package spells.dark

import gameunits.GameUnit
import gameunits.character.magics.BlackMage

class Thunder(manaCost: Int) extends AbstractDarkSpell(manaCost) {

  override def thunderSpell(blackMage: BlackMage): Unit = {
    blackMage.useThunder(this)
  }

  override def applySpell(target: GameUnit): Unit = {
    target.receiveThunder(this)
  }

}
