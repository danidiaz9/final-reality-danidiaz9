package weaponry.weapons.magics

import characters.player.Character
import characters.player.magics.{BlackWizard, WhiteWizard}
import weaponry.Weapon

import java.util.Objects

/** A class representing a staff magical weapon in the game.
 *
 *  A staff is a type of magical weapon that is used by spellcasters to enhance their magical abilities.
 *
 *  @constructor Creates a new instance of Staff with the specified attributes.
 *  @param name The name of the staff.
 *  @param attackPoints The attack points of the staff.
 *  @param weight The weight of the staff.
 *  @param owner The owner of the staff, represented as an optional character.
 *  @param magicAttackPoints The magic attack points of the staff.
 */
class Staff (
              name: String,
              attackPoints: Int,
              weight: Double,
              owner: Option[Character],
              magicAttackPoints: Int
          ) extends AbstractMagicalWeapon (name, attackPoints, weight, owner, magicAttackPoints) {

  /** Sets the owner of the staff to a black wizard character.
   *
   *  @param blackWizard The black wizard character who will be the owner of the staff.
   */
  override def setBlackWizard(blackWizard: BlackWizard): Unit = {
    blackWizard.setWeapon(this)
  }

  /** Sets the owner of the staff to a white wizard character.
   *
   *  @param whiteWizard The white wizard character who will be the owner of the staff.
   */
  override def setWhiteWizard(whiteWizard: WhiteWizard): Unit = {
    whiteWizard.setWeapon(this)
  }

  override def canEqual(that: Any): Boolean = that.isInstanceOf[Weapon]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Weapon]
      getName == other.getName &&
        getAttackPoints == other.getAttackPoints &&
        getWeight == other.getWeight &&
        getOwner == other.getOwner &&
        getMagicAttackPoints == other.getMagicAttackPoints
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Weapon],
    getName, getAttackPoints, getWeight, getOwner, getMagicAttackPoints)

  override def toString: String = s"Staff {" +
    s"name: $getName, " +
    s"attackPoints: $getAttackPoints, " +
    s"weight: $getWeight, " +
    s"owner: $getOwner, " +
    s"magicAttackPoints: $getMagicAttackPoints" +
    s"}"

}