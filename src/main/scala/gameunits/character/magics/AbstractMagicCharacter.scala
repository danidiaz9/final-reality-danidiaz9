package gameunits.character.magics

import exceptions.InvalidSpellException
import gameunits.GameUnit
import gameunits.character.AbstractCharacter
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

  def useThunder(target: GameUnit): Unit =
    throw new InvalidSpellException("Cannot use this spell.")

  def useFire(target: GameUnit): Unit =
    throw new InvalidSpellException("Cannot use this spell.")

  def useHealing(target: GameUnit): Unit =
    throw new InvalidSpellException("Cannot use this spell.")

  def usePoison(target: GameUnit): Unit =
    throw new InvalidSpellException("Cannot use this spell.")

  def useParalysis(target: GameUnit): Unit =
    throw new InvalidSpellException("Cannot use this spell.")

}