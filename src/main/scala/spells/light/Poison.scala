package spells.light

import gameunits.GameUnit
import gameunits.character.magics.WhiteMage

class Poison(manaCost: Int) extends AbstractLightSpell(manaCost) {

  override def poisonSpell(whiteMage: WhiteMage): Unit = {
    whiteMage.usePoison(this)
  }

  override def applySpell(target: GameUnit): Unit = {
    target.receivePoison(this)
  }

}
