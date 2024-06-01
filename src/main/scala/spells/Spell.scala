package spells

import gameunits.GameUnit
import gameunits.character.magics.{BlackMage, MagicCharacter, WhiteMage}

trait Spell {

  val manaCost: Int

  def getManaCost: Int

  def setMage(m: MagicCharacter): Unit

  def getMage: Option[MagicCharacter]

  def applySpell(target: GameUnit): Unit

  def healingSpell(whiteMage: WhiteMage): Unit

  def poisonSpell(whiteMage: WhiteMage): Unit

  def paralysisSpell(whiteMage: WhiteMage): Unit

  def thunderSpell(blackMage: BlackMage): Unit

  def fireSpell(blackMage: BlackMage): Unit

}
