package gameunits.character.magics

import gameunits.GameUnit
import spells.Spell
import spells.dark.{Fire, Thunder}
import spells.light.{Healing, Paralysis, Poison}

/** A trait representing a character with magical abilities.
 *
 *  Magic characters have attributes such as maximum mana points and the ability to cast spells.
 */
trait MagicCharacter {

  /** The maximum mana points of the magic character. */
  val maxManaPoints: Int

  /** Returns the current mana points of the magic character.
   *
   *  @return The current mana points of the magic character.
   */
  def getManaPoints: Int

  /** Sets the mana points of the magic character to the specified value.
   *
   *  @param x The value to set the mana points to.
   */
  def setManaPoints(x: Int): Unit

  /** Returns the spell currently equipped by the magic character.
   *
   *  @return The spell currently equipped by the magic character.
   */
  def getSpell: Option[Spell]

  /** Throws the equipped spell at the specified target.
   *
   *  @param target The target of the spell.
   */
  def throwSpell(target: GameUnit): Unit

  /** Equips a Thunder spell to the magic character.
   *
   *  @param thunder The Thunder spell to be equipped.
   */
  def equipThunder(thunder: Thunder): Unit

  /** Equips a Fire spell to the magic character.
   *
   *  @param fire The Fire spell to be equipped.
   */
  def equipFire(fire: Fire): Unit

  /** Equips a Healing spell to the magic character.
   *
   *  @param healing The Healing spell to be equipped.
   */
  def equipHealing(healing: Healing): Unit

  /** Equips a Poison spell to the magic character.
   *
   *  @param poison The Poison spell to be equipped.
   */
  def equipPoison(poison: Poison): Unit

  /** Equips a Paralysis spell to the magic character.
   *
   *  @param paralysis The Paralysis spell to be equipped.
   */
  def equipParalysis(paralysis: Paralysis): Unit

}
