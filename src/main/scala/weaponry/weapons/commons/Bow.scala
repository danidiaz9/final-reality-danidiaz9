package weaponry.weapons.commons

import characters.player.TraitPlayer
import characters.player.commons.{Ninja, Warrior}
import characters.player.magics.WhiteWizard

/** A class representing a bow weapon in the game.
 *
 *  A bow is a type of weapon used to inflict damage or harm to opponents in the game.
 *
 *  @constructor Creates a new instance of Bow with the specified attributes.
 *  @param name The name of the bow.
 *  @param attackPoints The attack points of the bow.
 *  @param weight The weight of the bow.
 *  @param owner The owner of the bow, represented as an optional character.
 */
class Bow (
            name: String,
            attackPoints: Int,
            weight: Double,
            owner: Option[TraitPlayer]
          ) extends AbstractCommonW (name, attackPoints, weight, owner) {

  /** Sets the owner of the bow to a warrior character.
   *
   *  @param warrior The warrior character who will be the owner of the bow.
   */
  def setWarrior(warrior: Warrior): Unit = {
    warrior.setWeapon(this)
  }

  /** Sets the owner of the bow to a ninja character.
   *
   *  @param ninja The ninja character who will be the owner of the bow.
   */
  def setNinja(ninja: Ninja): Unit = {
    ninja.setWeapon(this)
  }

  /** Sets the owner of the bow to a white wizard character.
   *
   *  @param whiteWizard The white wizard character who will be the owner of the bow.
   */
  def setWhiteWizard(whiteWizard: WhiteWizard): Unit = {
    whiteWizard.setWeapon(this)
  }

}