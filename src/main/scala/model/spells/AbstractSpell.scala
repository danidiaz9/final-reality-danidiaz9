package model.spells

import exceptions.InvalidSpellException
import model.effects.Effect
import model.gameunits.GameUnit
import model.gameunits.character.magics.{BlackMage, MagicCharacter, WhiteMage}

abstract class AbstractSpell extends Spell {

  val manaCost: Int = 0

  val effect: Effect = null

  def getManaCost: Int = manaCost

  def useByBlackMage(blackMage: BlackMage): Unit =
    throw new InvalidSpellException("Spell not available.")

  def useByWhiteMage(whiteMage: WhiteMage): Unit =
    throw new InvalidSpellException("Spell not available.")


}
