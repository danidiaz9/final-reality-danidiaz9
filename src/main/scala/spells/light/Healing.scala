package spells.light

import gameunits.character.magics.WhiteMage

class Healing extends AbstractLightSpell {

  val manaCost: Int = 15

  override def healingSpell(whiteMage: WhiteMage): Unit = {
    whiteMage.useHealing(this)
  }


}
