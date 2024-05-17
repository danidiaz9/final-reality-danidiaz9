package weapons.magics

import gameUnits.character.Character
import gameUnits.character.commons.Ninja
import gameUnits.character.magics.{BlackMage, WhiteMage}
import weapons.Weapon

import java.util.Objects

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
             owner: Option[Character],
             magicAttackPoints: Int
            ) extends AbstractMagicWeapon (name, attackPoints, weight, owner, magicAttackPoints) {

  /** Sets the owner of the wand to a ninja character.
   *
   *  @param ninja The ninja character who will be the owner of the wand.
   */
  override def setNinja(ninja: Ninja): Unit = {
    ninja.setWeapon(this)
  }

  /** Sets the owner of the wand to a black wizard character.
   *
   *  @param blackMage The black wizard character who will be the owner of the wand.
   */
  override def setBlackMage(blackMage: BlackMage): Unit = {
    blackMage.setWeapon(this)
  }

  /** Sets the owner of the wand to a white wizard character.
   *
   *  @param whiteMage The white wizard character who will be the owner of the wand.
   */
  override def setWhiteMage(whiteMage: WhiteMage): Unit = {
    whiteMage.setWeapon(this)
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

  override def toString: String = s"Wand {" +
    s"name: $getName, " +
    s"attackPoints: $getAttackPoints, " +
    s"weight: $getWeight, " +
    s"owner: $getOwner, " +
    s"magicAttackPoints: $getMagicAttackPoints" +
    s"}"

}