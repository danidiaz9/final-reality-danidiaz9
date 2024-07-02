package model.spells.light

import exceptions.InvalidSpellException
import model.gameunits.character.magics.WhiteMage
import model.spells.AbstractSpell

abstract class AbstractLight extends AbstractSpell {

  override def useByWhiteMage(whiteMage: WhiteMage): Unit = {
    if (getManaCost <= whiteMage.getManaPoints) {
      whiteMage.setManaPoints(whiteMage.getManaPoints - getManaCost)
    }
    else {
      throw new InvalidSpellException("Not enough mana.")
    }
  }

}
