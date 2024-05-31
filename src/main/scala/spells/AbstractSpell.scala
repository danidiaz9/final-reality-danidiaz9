package spells

import exceptions.InvalidSpellException
import gameunits.GameUnit
import gameunits.character.magics.{BlackMage, MagicCharacter, WhiteMage}

abstract class AbstractSpell extends Spell {

  def getManaCost: Int = manaCost

  private var mage: Option[MagicCharacter] = None

  def setMage(m: MagicCharacter): Unit = {
    mage = Some(m)
  }

  def getMage: Option[MagicCharacter] = mage

  def applySpell(spell: Spell, target: GameUnit): Unit =
    throw new InvalidSpellException("Invalid target.")

  def healingSpell(whiteMage: WhiteMage): Unit =
    throw new InvalidSpellException("Only white mages can use this spell.")

  def poisonSpell(whiteMage: WhiteMage): Unit =
    throw new InvalidSpellException("Only white mages can use this spell.")

  def paralysisSpell(whiteMage: WhiteMage): Unit =
    throw new InvalidSpellException("Only white mages can use this spell.")

  def thunderSpell(blackMage: BlackMage): Unit =
    throw new InvalidSpellException("Only black mages can use this spell.")

  def fireSpell(blackMage: BlackMage): Unit =
    throw new InvalidSpellException("Only black mages can use this spell.")

}
