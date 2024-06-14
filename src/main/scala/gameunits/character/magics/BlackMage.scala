package gameunits.character.magics

import exceptions.InvalidSpellException
import gameunits.GameUnit
import weapons.Weapon
import weapons.commons.Sword
import weapons.magics.{Staff, Wand}

import java.util.Objects

/** A class representing a black wizard character in the game.
 *
 *  @constructor Creates a new black wizard character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the black wizard character.
 *  @param maxHealthPoints The maximum health points of the black wizard character.
 *  @param currentHealthPoints The current health points of the black wizard character.
 *  @param defense The defense points of the black wizard character.
 *  @param weight The weight of the black wizard character.
 *  @param maxManaPoints The maximum mana points of the black wizard character.
 *  @param currentManaPoints The current mana points of the black wizard character.
 *  @param weapon The weapons equipped by the black wizard character.
 */

class BlackMage(name: String,
                maxHealthPoints: Int,
                currentHealthPoints: Int,
                defense: Int,
                weight: Double,
                maxManaPoints: Int,
                currentManaPoints: Int,
                weapon: Option[Weapon]) extends
                AbstractMagicCharacter(name,
                  maxHealthPoints,
                  currentHealthPoints,
                  defense,
                  weight,
                  maxManaPoints,
                  currentManaPoints,
                  weapon) {

  /** Equips a sword to the black wizard character.
   *
   *  @param sword The sword to be equipped.
   */
  override def equipSword(sword: Sword): Unit = {
    sword.setBlackMage(this)
  }

  /** Equips a wand to the black wizard character.
   *
   *  @param wand The wand to be equipped.
   */
  override def equipWand(wand: Wand): Unit = {
    wand.setBlackMage(this)
  }

  /** Equips a staff to the black wizard character.
   *
   *  @param staff The staff to be equipped.
   */
  override def equipStaff(staff: Staff): Unit = {
    staff.setBlackMage(this)
  }

  /** Equips a Thunder spell to the black wizard character.
   *
   *  @param target The Thunder spell to be equipped.
   *  @throws InvalidSpellException if the character does not have enough mana or a magic weapon equipped.
   */
  override def useThunder(target: GameUnit): Unit = {
    val manaCost: Int = 20
    if (manaCost <= getManaPoints &&
      target.getHealthPoints > 0 &&
      this.getWeapon.isDefined) {
      target.receiveDamage(this.getWeapon.get.getMagicAttackPoints)
      this.setManaPoints(getManaPoints - manaCost)
    }
    else {
      throw new InvalidSpellException("Need a magic weapon or not enough mana or dead unit.")
    }
  }

  /** Equips a Fire spell to the black wizard character.
   *
   *  @param target The Fire spell to be equipped.
   *  @throws InvalidSpellException if the character does not have enough mana or a magic weapon equipped.
   */
  override def useFire(target: GameUnit): Unit = {
    val manaCost: Int = 15
    if (manaCost <= getManaPoints &&
      target.getHealthPoints > 0 &&
      this.getWeapon.isDefined) {
      target.receiveDamage(this.getWeapon.get.getMagicAttackPoints)
      this.setManaPoints(getManaPoints - manaCost)
    }
    else {
      throw new InvalidSpellException("Need a magic weapon or not enough mana or dead unit.")
    }
  }

  def canEqual(that: Any): Boolean = that.isInstanceOf[BlackMage]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[BlackMage]
      getName == other.getName &&
        getHealthPoints == other.getHealthPoints &&
        getDefense == other.getDefense &&
        getWeight == other.getWeight &&
        getManaPoints == other.getManaPoints &&
        getWeapon == other.getWeapon
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[BlackMage],
    getName, getHealthPoints, getDefense, getWeight, getManaPoints, getWeapon)

  override def toString: String = s"BlackMage {" +
    s"name: $getName, " +
    s"currentHealthPoints: $getHealthPoints, " +
    s"defense: $getDefense, " +
    s"weight: $getWeight, " +
    s"manaPoints: $getManaPoints, " +
    s"weapons: $getWeapon" +
    s"}"
}
