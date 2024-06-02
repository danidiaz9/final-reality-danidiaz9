package gameunits.character.magics

import gameunits.GameUnit
import spells.Spell
import spells.dark.{Fire, Thunder}
import spells.light.{Healing, Paralysis, Poison}

trait MagicCharacter {

  val maxManaPoints: Int

  def getManaPoints: Int

  def setManaPoints(x: Int): Unit

  def getSpell: Option[Spell]

  def throwSpell(target: GameUnit): Unit

  def equipThunder(thunder: Thunder): Unit

  def equipFire(fire: Fire): Unit

  def equipHealing(healing: Healing): Unit

  def equipPoison(poison: Poison): Unit

  def equipParalysis(paralysis: Paralysis): Unit

}
