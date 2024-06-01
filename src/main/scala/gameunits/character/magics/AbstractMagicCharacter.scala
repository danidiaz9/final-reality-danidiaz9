package gameunits.character.magics

import exceptions.InvalidSpellException
import gameunits.GameUnit
import gameunits.character.AbstractCharacter
import spells.Spell
import spells.dark.{Fire, Thunder}
import spells.light.{Healing, Paralysis, Poison}
import weapons.Weapon

/** An abstract class representing a magical character in the game.
 *
 *  @constructor Creates a new magical character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the magical character.
 *  @param currentHealthPoints The current health points of the magical character.
 *  @param defense The defense points of the magical character.
 *  @param weight The weight of the magical character.
 *  @param currentManaPoints The current mana points of the magical character.
 *  @param weapon The weapons equipped by the magical character.
 */

abstract class AbstractMagicCharacter(name: String,
                                      maxHealthPoints: Int,
                                      currentHealthPoints: Int,
                                      defense: Int,
                                      weight: Double,
                                      val maxManaPoints: Int,
                                      var currentManaPoints: Int,
                                      weapon: Option[Weapon])
  extends AbstractCharacter(name,maxHealthPoints, currentHealthPoints, defense, weight, weapon)
    with MagicCharacter {

  private var spell: Option[Spell] = None

  def getManaPoints: Int = currentManaPoints

  def setManaPoints(x: Int): Unit = {
    currentManaPoints = x
  }

  def knownSpell(s: Spell): Unit ={
    spell = Some(s)
  }

  def throwSpell(target: GameUnit): Unit = _

  def useThunder(thunder: Thunder): Unit =
    throw new InvalidSpellException("Mage cannot use thunder.")

  def useFire(fire: Fire): Unit =
    throw new InvalidSpellException("Mage cannot use fire.")

  def useHealing(healing: Healing): Unit =
    throw new InvalidSpellException("Mage cannot use healing.")

  def usePoison(poison: Poison): Unit =
    throw new InvalidSpellException("Mage cannot use poison.")

  def useParalysis(paralysis: Paralysis): Unit =
    throw new InvalidSpellException("Mage cannot use paralysis.")

}