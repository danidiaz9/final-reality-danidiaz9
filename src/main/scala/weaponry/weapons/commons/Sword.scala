package weaponry.weapons.commons

import characters.player.TraitPlayer
import characters.player.commons.{Ninja, Paladin, Warrior}
import characters.player.magics.BlackWizard

/** A class representing a sword weapon in the game.
 *
 *  A sword is a type of weapon used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of Sword with the specified attributes.
 *  @param name The name of the sword.
 *  @param attackPoints The attack points of the sword.
 *  @param weight The weight of the sword.
 *  @param owner The owner of the sword, represented as an optional character.
 */
class Sword (
            name: String,
            attackPoints: Int,
            weight: Double,
            owner: Option[TraitPlayer]
          ) extends AbstractCommonW (name, attackPoints, weight, owner) {

  /** Sets the owner of the sword to a paladin character.
   *
   *  @param paladin The paladin character who will be the owner of the sword.
   */
  def setPaladin(paladin: Paladin): Unit = {
    paladin.setWeapon(this)
  }

  /** Sets the owner of the sword to a warrior character.
   *
   *  @param warrior The warrior character who will be the owner of the sword.
   */
  def setWarrior(warrior: Warrior): Unit = {
    warrior.setWeapon(this)
  }

  /** Sets the owner of the sword to a ninja character.
   *
   *  @param ninja The ninja character who will be the owner of the sword.
   */
  def setNinja(ninja: Ninja): Unit = {
    ninja.setWeapon(this)
  }

  /** Sets the owner of the sword to a black wizard character.
   *
   *  @param blackWizard The black wizard character who will be the owner of the sword.
   */
  def setBlackWizard(blackWizard: BlackWizard): Unit = {
    blackWizard.setWeapon(this)
  }

}