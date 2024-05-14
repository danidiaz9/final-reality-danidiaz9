package weaponry.weapons.magics

import characters.player.TraitPlayer
import characters.player.commons.Ninja
import characters.player.magics.{BlackWizard, WhiteWizard}

/** A class representing a wand magical weapon in the game.
 *
 *  A wand is a type of magical weapon that is commonly used by spellcasters to channel their magical abilities.
 *
 *  @constructor Creates a new instance of Wand with the specified attributes.
 *  @param name The name of the wand.
 *  @param attackPoints The attack points of the wand.
 *  @param weight The weight of the wand.
 *  @param owner The owner of the wand, represented as an optional character.
 *  @param magicAttackPoints The magic attack points of the wand.
 */
class Wand (
              name: String,
              attackPoints: Int,
              weight: Double,
              owner: Option[TraitPlayer],
              magicAttackPoints: Int
            ) extends AbstractMagicalW (name, attackPoints, weight, owner, magicAttackPoints) {

  /** Sets the owner of the wand to a ninja character.
   *
   *  @param ninja The ninja character who will be the owner of the wand.
   */
  def setNinja(ninja: Ninja): Unit = {
    ninja.setWeapon(this)
  }

  /** Sets the owner of the wand to a black wizard character.
   *
   *  @param blackWizard The black wizard character who will be the owner of the wand.
   */
  def setBlackWizard(blackWizard: BlackWizard): Unit = {
    blackWizard.setWeapon(this)
  }

  /** Sets the owner of the wand to a white wizard character.
   *
   *  @param whiteWizard The white wizard character who will be the owner of the wand.
   */
  def setWhiteWizard(whiteWizard: WhiteWizard): Unit = {
    whiteWizard.setWeapon(this)
  }

}