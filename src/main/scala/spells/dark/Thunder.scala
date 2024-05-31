package spells.dark

import gameunits.character.magics.BlackMage

class Thunder extends AbstractDarkSpell {

  val manaCost: Int = 20

  override def thunderSpell(blackMage: BlackMage): Unit = {
    blackMage.useThunder(this)
  }

}
