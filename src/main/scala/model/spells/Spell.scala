package model.spells

import model.gameunits.character.magics.{BlackMage, WhiteMage}

trait Spell {

  val manaCost: Int

  def getManaCost: Int

  def useByBlackMage(blackMage: BlackMage): Unit

  def useByWhiteMage(whiteMage: WhiteMage): Unit

}
