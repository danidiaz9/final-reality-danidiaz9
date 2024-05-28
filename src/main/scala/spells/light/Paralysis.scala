package spells.light

import gameunits.character.magics.WhiteMage
import spells.AbstractSpell

class Paralysis extends AbstractSpell {

  override val manaCost: Int = 25

  override def paralysisSpell(whiteMage: WhiteMage): Unit = {
    whiteMage.useParalysis(this)
  }

}
