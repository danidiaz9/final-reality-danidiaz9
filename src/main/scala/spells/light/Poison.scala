package spells.light

import gameunits.character.magics.WhiteMage

class Poison extends AbstractLightSpell {

  val manaCost: Int = 30

  override def poisonSpell(whiteMage: WhiteMage): Unit = {
    whiteMage.usePoison(this)
  }

}
