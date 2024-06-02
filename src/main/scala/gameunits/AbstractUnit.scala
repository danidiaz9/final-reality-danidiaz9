package gameunits

import gameunits.character.Character
import exceptions.{InvalidAttackException, InvalidSpellException, Require}
import spells.dark.{Fire, Thunder}
import spells.light.{Healing, Paralysis, Poison}

/** An abstract class representing a character in the game.
 *
 *  @constructor Creates a new character with the specified name, health points, defense, and weight.
 *  @param name The name of the character.
 *  @param currentHealthPoints The current health points of the character.
 *  @param defense The defense points of the character.
 *  @param weight The weight of the character.
 */
abstract class AbstractUnit(val name: String,
                            val maxHealthPoints: Int,
                            protected var currentHealthPoints: Int,
                            val attackPoints: Int,
                            protected var defense: Int,
                            val weight: Double) extends GameUnit {

  Require.Stat(currentHealthPoints, "currentHealthPoints").atLeast(0)

  /** The action bar of the character. */
  var actionBar: Double = 0.0

  /** Returns the name of the character.
   *
   *  @return The name of the character.
   */
  def getName: String = name

  /** Returns the current health points of the character.
   *
   *  @return The current health points of the character.
   */
  def getHealthPoints: Int = currentHealthPoints

  /** Sets the health points of the character to the specified value.
   *
   *  @param x The value to set the health points to.
   */
  def setHealthPoints(x: Int): Unit = {
    currentHealthPoints = x
  }

  /** Returns the attackCharacter points of the character.
   *
   *  @return The attackCharacter points of the character.
   */
  def getAttackPoints: Int = attackPoints

  /** Returns the defense points of the character.
   *
   *  @return The defense points of the character.
   */
  def getDefense: Int = defense

  /** Returns the weight of the character.
   *
   *  @return The weight of the character.
   */
  def getWeight: Double = weight

  /** Returns the action bar of the character.
   *
   *  @return The action bar of the character.
   */
  def getActionBar: Double = actionBar

  /** Calculates the maximum action bar value for the character based on its weight.
   *
   *  @return The maximum action bar value.
   */
  def calculateMaxActionBar: Double = {
    val charWeight = this.getWeight
    val maxActionBar = charWeight
    maxActionBar

  }

  def attack(gameUnit: GameUnit): Unit =
    throw new InvalidAttackException("This game unit cannot attack an ally of the same type.")

  def receiveAttack(damage: Int): Unit =
    throw new InvalidAttackException("Attack cannot impact this unit.")

  def receiveHealing(healing: Healing): Unit =
    throw new InvalidSpellException("Spell cannot impact this unit.")

  def receiveParalysis(paralysis: Paralysis, from: Character): Unit =
    throw new InvalidSpellException("Spell cannot impact this unit.")

  def receivePoison(poison: Poison, from: Character): Unit =
    throw new InvalidSpellException("Spell cannot impact this unit.")

  def receiveFire(fire: Fire, from: Character): Unit =
    throw new InvalidSpellException("Spell cannot impact this unit.")

  def receiveThunder(thunder: Thunder, from: Character): Unit =
    throw new InvalidSpellException("Spell cannot impact this unit.")


}
