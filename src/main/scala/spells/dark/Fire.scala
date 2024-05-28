package spells.dark

import gameunits.character.magics.BlackMage
import spells.AbstractSpell

class Fire extends AbstractSpell {

  override val manaCost: Int = 15

  override def fireSpell(blackMage: BlackMage): Unit = {
    blackMage.useFire(this)
  }

}
