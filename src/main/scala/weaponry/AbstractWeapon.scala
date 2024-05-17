package weaponry

import characters.player.Character
import characters.player.commons.{Ninja, Paladin, Warrior}
import characters.player.magics.{BlackWizard, WhiteWizard}

/** An abstract class representing a type of weaponry in the game.
 *
 *  Weaponry includes attributes such as name, attack points, weight, and owner.
 *
 *  @constructor Creates a new instance of AbstractWeapon with the specified attributes.
 *  @param name The name of the weapon.
 *  @param attackPoints The attack points of the weapon.
 *  @param weight The weight of the weapon.
 *  @param owner The owner of the weapon, represented as an optional character.
 */
abstract class AbstractWeapon(
                                 val name: String,
                                 val attackPoints: Int,
                                 val weight: Double,
                                 var owner: Option[Character] = None
                               ) extends Weapon {


  /** Returns the name of the weapon.
   *
   *  @return The name of the weapon.
   */
  def getName: String = name

  /** Returns the attack points of the weapon.
   *
   *  @return The attack points of the weapon.
   */
  def getAttackPoints: Int = attackPoints

  /** Returns the weight of the weapon.
   *
   *  @return The weight of the weapon.
   */
  def getWeight: Double = weight

  /** Returns the owner of the weapon.
   *
   *  @return The owner of the weapon.
   */
  def getOwner: Option[Character] = owner

  /** Sets the owner of the weapon.
   *
   *  @param o The owner of the weapon.
   */
  def setOwner(o: Character): Unit = {
    owner = Some(o)
    o.setWeapon(this)
  }

  def setNinja(ninja: Ninja): Unit = throw new InvalidSetException()

  def setPaladin(paladin: Paladin): Unit = throw new InvalidSetException()

  def setWarrior(warrior: Warrior): Unit = throw new InvalidSetException()

  def setBlackWizard(blackWizard: BlackWizard): Unit = throw new InvalidSetException()

  def setWhiteWizard(whiteWizard: WhiteWizard): Unit = throw new InvalidSetException()

}
