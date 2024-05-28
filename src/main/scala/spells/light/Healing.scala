package spells.light

import gameunits.character.magics.WhiteMage
import spells.AbstractSpell

class Healing extends AbstractSpell {

  override val manaCost: Int = 15

  override def healingSpell(whiteMage: WhiteMage): Unit = {
    whiteMage.useHealing(this)
  }

}
