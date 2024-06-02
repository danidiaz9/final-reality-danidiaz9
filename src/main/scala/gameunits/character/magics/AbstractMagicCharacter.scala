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
 *  @param maxHealthPoints The maximum health points of the magical character.
 *  @param currentHealthPoints The current health points of the magical character.
 *  @param defense The defense points of the magical character.
 *  @param weight The weight of the magical character.
 *  @param maxManaPoints The maximum mana points of the magical character.
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

  /** The spell currently equipped by the magical character. */
  private val spell: Option[Spell] = None

  /** Returns the current mana points of the magical character.
   *
   *  @return The current mana points of the magical character.
   */
  def getManaPoints: Int = currentManaPoints

  /** Sets the mana points of the magical character to the specified value.
   *
   *  @param x The value to set the mana points to.
   */
  def setManaPoints(x: Int): Unit = {
    currentManaPoints = x
  }

  /** Returns the spell currently equipped by the magical character.
   *
   *  @return The spell currently equipped by the magical character.
   */
  def getSpell: Option[Spell] = spell

  /** Throws the equipped spell at the specified target.
   *
   *  @param target The target of the spell.
   */
  def throwSpell(target: GameUnit): Unit = {
    throw new InvalidSpellException("Invalid target")
  }

  /** Equips a Thunder spell to the magical character.
   *
   *  @param thunder The Thunder spell to be equipped.
   */
  def equipThunder(thunder: Thunder): Unit =
    throw new InvalidSpellException("Mage cannot use thunder.")

  /** Equips a Fire spell to the magical character.
   *
   *  @param fire The Fire spell to be equipped.
   */
  def equipFire(fire: Fire): Unit =
    throw new InvalidSpellException("Mage cannot use fire.")

  /** Equips a Healing spell to the magical character.
   *
   *  @param healing The Healing spell to be equipped.
   */
  def equipHealing(healing: Healing): Unit =
    throw new InvalidSpellException("Mage cannot use healing.")

  /** Equips a Poison spell to the magical character.
   *
   *  @param poison The Poison spell to be equipped.
   */
  def equipPoison(poison: Poison): Unit =
    throw new InvalidSpellException("Mage cannot use poison.")

  /** Equips a Paralysis spell to the magical character.
   *
   *  @param paralysis The Paralysis spell to be equipped.
   */
  def equipParalysis(paralysis: Paralysis): Unit =
    throw new InvalidSpellException("Mage cannot use paralysis.")

}