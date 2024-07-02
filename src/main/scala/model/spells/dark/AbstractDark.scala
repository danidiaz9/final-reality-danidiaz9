package model.spells.dark

import exceptions.InvalidSpellException
import model.gameunits.character.magics.BlackMage
import model.spells.AbstractSpell

abstract class AbstractDark extends AbstractSpell {

  override def useByBlackMage(blackMage: BlackMage): Unit = {
    if (getManaCost <= blackMage.getManaPoints) {
      blackMage.setManaPoints(blackMage.getManaPoints - getManaCost)
    }
    else {
      throw new InvalidSpellException("Not enough mana.")
    }
  }

}
