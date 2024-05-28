package spells.light

import gameunits.character.magics.WhiteMage
import spells.AbstractSpell

class Poison extends AbstractSpell {

  override val manaCost: Int = 30

  override def poisonSpell(whiteMage: WhiteMage): Unit = {
    whiteMage.usePoison(this)
  }

}
