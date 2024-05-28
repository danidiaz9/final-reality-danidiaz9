package spells

import gameunits.character.magics.{BlackMage, WhiteMage}

trait Spell {

  val manaCost: Int

  def useLightSpell(whiteMage: WhiteMage): Unit

  def useDarkSpell(blackMage: BlackMage): Unit

}
