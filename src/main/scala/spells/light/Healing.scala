package spells.light

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.WhiteMage

class Healing extends AbstractLightSpell {

  override val manaCost: Int = 15

  override def setSpellWhiteMage(whiteMage: WhiteMage): Unit = {
    whiteMage.equipHealing(this)
  }

  override def applySpell(target: GameUnit, from: Character): Unit = {
    target.receiveHealing(this)
  }

}
