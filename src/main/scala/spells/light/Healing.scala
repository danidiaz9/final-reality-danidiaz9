package spells.light

import gameunits.GameUnit
import gameunits.character.magics.WhiteMage

class Healing(manaCost: Int) extends AbstractLightSpell(manaCost) {

  override def healingSpell(whiteMage: WhiteMage): Unit = {
    whiteMage.useHealing(this)
  }

  override def applySpell(target: GameUnit): Unit = {
    target.receiveHealing(this)
  }

}
