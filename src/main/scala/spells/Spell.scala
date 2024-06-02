package spells

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.{BlackMage, MagicCharacter, WhiteMage}

trait Spell {

  val manaCost: Int

  def getManaCost: Int

  def setMage(m: MagicCharacter): Unit

  def setSpellBlackMage(blackMage: BlackMage): Unit

  def setSpellWhiteMage(whiteMage: WhiteMage): Unit

  def getMage: Option[MagicCharacter]

  def applySpell(target: GameUnit, from: Character): Unit

}
