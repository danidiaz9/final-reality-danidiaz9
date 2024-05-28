package spells

import gameunits.character.magics.{BlackMage, WhiteMage}

trait Spell {

  val manaCost: Int

  def healingSpell(whiteMage: WhiteMage): Unit

  def poisonSpell(whiteMage: WhiteMage): Unit

  def paralysisSpell(whiteMage: WhiteMage): Unit

  def thunderSpell(blackMage: BlackMage): Unit

  def fireSpell(blackMage: BlackMage): Unit

}
