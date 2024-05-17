package weapons

import gameUnits.character.Character
import gameUnits.character.commons.{Ninja, Paladin, Warrior}
import gameUnits.character.magics.{BlackMage, WhiteMage}

/** A trait representing weapons in the game.
 *
 *  Weaponry includes attributes such as name, attack points, weight, and owner.
 */
trait Weapon {

  /** The name of the weapon. */
  val name: String

  /** The attack points of the weapon. */
  val attackPoints: Int

  /** The weight of the weapon. */
  val weight: Double

  /** Returns the name of the weapon.
   *
   *  @return The name of the weapon.
   */
  def getName: String

  /** Returns the attack points of the weapon.
   *
   *  @return The attack points of the weapon.
   */
  def getAttackPoints: Int

  /** Returns the weight of the weapon.
   *
   *  @return The weight of the weapon.
   */
  def getWeight: Double

  /** Returns the owner of the weapon.
   *
   *  @return The owner of the weapon.
   */
  def getOwner: Option[Character]

  /** Sets the owner of the weapon.
   *
   * */
  def setOwner(o: Character): Unit

  def setNinja(ninja: Ninja): Unit

  def setPaladin(paladin: Paladin): Unit

  def setWarrior(warrior: Warrior): Unit

  def setBlackMage(blackMage: BlackMage): Unit

  def setWhiteMage(whiteMage: WhiteMage): Unit

}
