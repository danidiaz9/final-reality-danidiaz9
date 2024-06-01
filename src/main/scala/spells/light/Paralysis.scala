package spells.light

import gameunits.GameUnit
import gameunits.character.magics.WhiteMage

class Paralysis(manaCost: Int) extends AbstractLightSpell(manaCost) {

  override def paralysisSpell(whiteMage: WhiteMage): Unit = {
    whiteMage.useParalysis(this)
  }

  override def applySpell(target: GameUnit): Unit = {
    target.receiveParalysis(this)
  }

}
