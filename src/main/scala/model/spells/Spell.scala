package model.spells

import model.effects.Effect
import model.gameunits.GameUnit
import model.gameunits.character.magics.{BlackMage, MagicCharacter, WhiteMage}

trait Spell {

  val manaCost: Int

  val effect: Effect

  def getManaCost: Int

  def useByBlackMage(blackMage: BlackMage): Unit

  def useByWhiteMage(whiteMage: WhiteMage): Unit

}
