package gameunits.character.magics

import gameunits.GameUnit

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

  def useThunder(target: GameUnit): Unit

  def useFire(target: GameUnit): Unit

  def useHealing(target: GameUnit): Unit

  def usePoison(target: GameUnit): Unit

  def useParalysis(target: GameUnit): Unit

}
