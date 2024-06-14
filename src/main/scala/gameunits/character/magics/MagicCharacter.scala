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

  /** Uses a thunder spell on the specified target.
   *
   *  @param target The game unit to cast the thunder spell on.
   */
  def useThunder(target: GameUnit): Unit

  /** Uses a fire spell on the specified target.
   *
   *  @param target The game unit to cast the fire spell on.
   */
  def useFire(target: GameUnit): Unit

  /** Uses a healing spell on the specified target.
   *
   *  @param target The game unit to cast the healing spell on.
   */
  def useHealing(target: GameUnit): Unit

  /** Uses a poison spell on the specified target.
   *
   *  @param target The game unit to cast the poison spell on.
   */
  def usePoison(target: GameUnit): Unit

  /** Uses a paralysis spell on the specified target.
   *
   *  @param target The game unit to cast the paralysis spell on.
   */
  def useParalysis(target: GameUnit): Unit

}
