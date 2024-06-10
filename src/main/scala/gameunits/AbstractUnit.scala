package gameunits

import gameunits.character.Character
import exceptions.{InvalidAttackException, InvalidSpellException, Require}
import spells.dark.{Fire, Thunder}
import spells.light.{Healing, Paralysis, Poison}

/** An abstract class representing a character in the game.
 *
 *  @constructor Creates a new character with the specified name, health points, defense, and weight.
 *  @param name The name of the character.
 *  @param maxHealthPoints The maximum health points of the character.
 *  @param currentHealthPoints The current health points of the character.
 *  @param attackPoints The attack points of the character.
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

  /** Attack another game unit.
   *
   *  @param gameUnit The game unit to attack.
   *  @throws InvalidAttackException if this game unit cannot attack an ally of the same type.
   */
  def attack(gameUnit: GameUnit): Unit =
    throw new InvalidAttackException("This game unit cannot attack an ally of the same type.")

  /** Receive an attack and reduce health points accordingly.
   *
   *  @param damage The amount of damage received.
   *  @throws InvalidAttackException if an attack cannot impact this unit.
   */
  def receiveDamage(damage: Int): Unit =
    throw new InvalidAttackException("Attack cannot impact this unit.")

  /** Receive healing from a spell.
   *
   *  @param healing The healing spell to receive.
   *  @throws InvalidSpellException if the spell cannot impact this unit.
   */
  def receiveHealing(healing: Healing): Unit =
    throw new InvalidSpellException("Spell cannot impact this unit.")

  /** Receive paralysis from a spell.
   *
   *  @param paralysis The paralysis spell to receive.
   *  @param from The character who cast the spell.
   *  @throws InvalidSpellException if the unit is dead.
   */
  def receiveParalysis(paralysis: Paralysis, from: Character): Unit = {
    if (0 < this.getHealthPoints){
      paralysis.applySpell(this, from)
    }
    else {
      throw new InvalidSpellException("Unit is dead.")
    }
  }

  /** Receive poison from a spell.
   *
   *  @param poison The poison spell to receive.
   *  @param from The character who cast the spell.
   *  @throws InvalidSpellException if the unit is dead.
   */
  def receivePoison(poison: Poison, from: Character): Unit = {
    if (0 < this.getHealthPoints){
      poison.applySpell(this, from)
    }
    else {
      throw new InvalidSpellException("Unit is dead.")
    }
  }

  /** Receive fire damage from a spell.
   *
   *  @param fire The fire spell to receive.
   *  @param from The character who cast the spell.
   *  @throws InvalidSpellException if the unit is dead.
   */
  def receiveFire(fire: Fire, from: Character): Unit = {
    if (0 < this.getHealthPoints){
      fire.applySpell(this, from)
    }
    else {
      throw new InvalidSpellException("Unit is dead.")
    }
  }


  /** Receive thunder damage from a spell.
   *
   *  @param thunder The thunder spell to receive.
   *  @param from The character who cast the spell.
   *  @throws InvalidSpellException if the unit is dead.
   */
  def receiveThunder(thunder: Thunder, from: Character): Unit = {
    if (0 < this.getHealthPoints){
      thunder.applySpell(this, from)
    }
    else {
      throw new InvalidSpellException("Unit is dead.")
    }
  }
}
