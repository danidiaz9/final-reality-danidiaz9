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

  def useThunder(thunder: Thunder): Unit

  def useFire(fire: Fire): Unit

  def useHealing(healing: Healing): Unit

  def usePoison(poison: Poison): Unit

  def useParalysis(paralysis: Paralysis): Unit

}
