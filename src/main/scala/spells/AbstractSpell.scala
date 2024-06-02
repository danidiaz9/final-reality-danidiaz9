package spells

import exceptions.InvalidSpellException
import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.{BlackMage, MagicCharacter, WhiteMage}

abstract class AbstractSpell extends Spell {


  def getManaCost: Int = manaCost

  private var mage: Option[MagicCharacter] = None

  def setMage(m: MagicCharacter): Unit = {
    mage = Some(m)
  }

  def setSpellBlackMage(blackMage: BlackMage): Unit =
    throw new InvalidSpellException("Spell cannot be setting in this character.")

  def setSpellWhiteMage(whiteMage: WhiteMage): Unit =
    throw new InvalidSpellException("Spell cannot be setting in this character.")

  def getMage: Option[MagicCharacter] = mage

  def applySpell(target: GameUnit, from: Character): Unit =
    throw new InvalidSpellException("Invalid target.")

}
