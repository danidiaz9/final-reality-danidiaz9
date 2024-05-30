package spells.light

import gameunits.GameUnit
import gameunits.character.magics.WhiteMage
import spells.{AbstractSpell, Spell}

class Healing extends AbstractSpell {

  override val manaCost: Int = 15

  override def healingSpell(whiteMage: WhiteMage): Unit = {
    whiteMage.useHealing(this)
  }

  override def applySpell(spell: Spell, target: GameUnit): Unit = {
    this.
  }

}
