package spells

import exceptions.InvalidSpellException
import gameunits.character.magics.{BlackMage, WhiteMage}

abstract class AbstractSpell extends Spell {

  val manaCost: Int = null

  def useLightSpell(whiteMage: WhiteMage): Unit =
    throw new InvalidSpellException("Only white mages can use this spell.")

  def useDarkSpell(blackMage: BlackMage): Unit =
    throw new InvalidSpellException("Only black mages can use this spell.")

}
