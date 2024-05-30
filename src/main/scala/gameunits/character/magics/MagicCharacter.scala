package gameunits.character.magics

import gameunits.GameUnit
import spells.Spell
import spells.dark.{Fire, Thunder}
import spells.light.{Healing, Paralysis, Poison}

trait MagicCharacter {

  def getManaPoints: Int

  def setManaPoints(x: Int): Unit

  def throwSpell(target: GameUnit, spell: Spell): Unit

  def useThunder(thunder: Thunder): Unit

  def useFire(fire: Fire): Unit

  def useHealing(healing: Healing): Unit

  def usePoison(poison: Poison): Unit

  def useParalysis(paralysis: Paralysis): Unit

}
