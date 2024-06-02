package gameunits

import gameunits.character.Character
import spells.dark.{Fire, Thunder}
import spells.light.{Healing, Paralysis, Poison}

/** Trait representing a character in the game.
 *
 * This trait defines the basic properties and behaviors of a character,
 * such as name, health points, defense, weight, and actions.
 */
trait GameUnit {
  /** The name of the character.
   *
   */
  val name: String

  /** The weight of the character.
   *
   */
  val weight: Double

  /** The action bar of the character. */
  var actionBar: Double

  /** Returns the name of the character.
   *
   * @return The name of the character.
   */
  def getName: String

  /** Returns the current health points of the character.
   *
   *  @return The current health points of the character.
   */
  def getHealthPoints: Int

  /** Sets the health points of the character to the specified value.
   *
   *  @param x The value to set the health points to.
   */
  def setHealthPoints(x: Int): Unit

  /** Returns the defense points of the character.
   *
   *  @return The defense points of the character.
   */
  def getDefense: Int

  /** Returns the weight of the character.
   *
   *  @return The weight of the character.
   */
  def getWeight: Double

  /** Returns the action bar of the character.
   *
   *  @return The action bar of the character.
   */
  def getActionBar: Double

  /** Calculates and returns the maximum value of the action bar for the character.
   *
   *  @return The maximum value of the action bar for the character.
   */
  def calculateMaxActionBar: Double

  /** Attack another game unit.
   *
   *  @param gameUnit The game unit to attack.
   */
  def attack(gameUnit: GameUnit): Unit

  /** Receive an attack and reduce health points accordingly.
   *
   *  @param damage The amount of damage received.
   */
  def receiveAttack(damage: Int): Unit

  /** Receive healing from a spell.
   *
   *  @param healing The healing spell to receive.
   */
  def receiveHealing(healing: Healing): Unit

  /** Receive paralysis from a spell.
   *
   *  @param paralysis The paralysis spell to receive.
   *  @param from The character who cast the spell.
   */
  def receiveParalysis(paralysis: Paralysis, from: Character): Unit

  /** Receive poison from a spell.
   *
   *  @param poison The poison spell to receive.
   *  @param from The character who cast the spell.
   */
  def receivePoison(poison: Poison, from: Character): Unit

  /** Receive fire damage from a spell.
   *
   *  @param fire The fire spell to receive.
   *  @param from The character who cast the spell.
   */
  def receiveFire(fire: Fire, from: Character): Unit

  /** Receive thunder damage from a spell.
   *
   *  @param thunder The thunder spell to receive.
   *  @param from The character who cast the spell.
   */
  def receiveThunder(thunder: Thunder, from: Character): Unit

}