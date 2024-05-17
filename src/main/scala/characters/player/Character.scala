package characters.player

import characters.GameUnit
import weaponry.Weapon
import weaponry.weapons.commons.{Axe, Bow, Sword}
import weaponry.weapons.magics.{Staff, Wand}

/** Trait representing a player-controlled character.
 *
 * This trait extends the basic properties of a character in the game,
 * adding the ability to equip and change weapons.
 */
trait Character extends GameUnit {

  /** Returns the weapon currently equipped by the player.
   *
   *  @return The weapon currently equipped by the player.
   */
  def getWeapon: Option[Weapon]

  /** Sets the weapon to be equipped by the player.
   *
   *  @param weapon The weapon to be equipped by the player.
   */
  def setWeapon(weapon: Weapon): Unit

  def equipAxe(axe: Axe): Unit

  def equipBow(bow: Bow): Unit

  def equipSword(sword: Sword): Unit

  def equipWand(wand: Wand): Unit

  def equipStaff(staff: Staff): Unit

}
