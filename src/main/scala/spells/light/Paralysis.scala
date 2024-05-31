package spells.light

import gameunits.character.magics.WhiteMage

class Paralysis extends AbstractLightSpell {

  val manaCost: Int = 25

  override def paralysisSpell(whiteMage: WhiteMage): Unit = {
    whiteMage.useParalysis(this)
  }

}
