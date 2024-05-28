package spells.dark

import gameunits.character.magics.BlackMage
import spells.AbstractSpell

class Thunder extends AbstractSpell {

  override val manaCost: Int = 20

  override def thunderSpell(blackMage: BlackMage): Unit = {
    blackMage.useThunder(this)
  }

}
