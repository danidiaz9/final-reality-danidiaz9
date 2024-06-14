package gameunits.character.magics

import exceptions.InvalidSpellException
import gameunits.GameUnit
import weapons.Weapon
import weapons.commons.Bow
import weapons.magics.{Staff, Wand}

import java.util.Objects

/** A class representing a white wizard character in the game.
 *
 *  @constructor Creates a new white wizard character with the specified name, health points,
 *               defense, weight, and mana points.
 *  @param name The name of the white wizard character.
 *  @param maxHealthPoints The maximum health points of the white wizard character.
 *  @param currentHealthPoints The current health points of the white wizard character.
 *  @param defense The defense points of the white wizard character.
 *  @param weight The weight of the white wizard character.
 *  @param maxManaPoints The maximum mana points of the white wizard character.
 *  @param currentManaPoints The current mana points of the white wizard character.
 *  @param weapon The weapons equipped by the white wizard character.
 */

class WhiteMage(name: String,
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

  /** Equips a bow to the white wizard character.
   *
   *  @param bow The bow to be equipped.
   */
  override def equipBow(bow: Bow): Unit = {
    bow.setWhiteMage(this)
  }

  /** Equips a wand to the white wizard character.
   *
   *  @param wand The wand to be equipped.
   */
  override def equipWand(wand: Wand): Unit = {
    wand.setWhiteMage(this)
  }

  /** Equips a staff to the white wizard character.
   *
   *  @param staff The staff to be equipped.
   */
  override def equipStaff(staff: Staff): Unit = {
    staff.setWhiteMage(this)
  }

  /** Equips a Healing spell to the white wizard character.
   *
   *  @param target The Healing spell to be equipped.
   *  @throws InvalidSpellException if the character does not have enough mana or a magic weapon equipped.
   */
  override def useHealing(target: GameUnit): Unit = {
    val manaCost: Int = 15
    if (manaCost <= getManaPoints &&
      target.getHealthPoints > 0 &&
      this.getWeapon.isDefined){
      target.receiveHealing()
      this.setManaPoints(getManaPoints - manaCost)
    }
    else {
      throw new InvalidSpellException("Need a magic weapon or not enough mana or dead unit.")
    }
  }

  /** Equips a Poison spell to the white wizard character.
   *
   *  @param target The Poison spell to be equipped.
   *  @throws InvalidSpellException if the character does not have enough mana or a magic weapon equipped.
   */
  override def usePoison(target: GameUnit): Unit = {
    val manaCost: Int = 30
    if (manaCost <= getManaPoints &&
      target.getHealthPoints > 0 &&
      this.getWeapon.isDefined){
      target.receiveMagicDamage(this.getWeapon.get.getMagicAttackPoints)
      this.setManaPoints(getManaPoints - manaCost)
    }
    else {
      throw new InvalidSpellException("Need a magic weapon or not enough mana or dead unit.")
    }
  }

  /** Equips a Paralysis spell to the white wizard character.
   *
   *  @param target The Paralysis spell to be equipped.
   *  @throws InvalidSpellException if the character does not have enough mana or a magic weapon equipped.
   */
  override def useParalysis(target: GameUnit): Unit = {
    val manaCost: Int = 25
    if (manaCost <= getManaPoints &&
      target.getHealthPoints > 0 &&
      this.getWeapon.isDefined){
      target.receiveMagicDamage(this.getWeapon.get.getMagicAttackPoints)
      this.setManaPoints(getManaPoints - manaCost)
    }
    else {
      throw new InvalidSpellException("Need a magic weapon or not enough mana or dead unit.")
    }
  }

  def canEqual(that: Any): Boolean = that.isInstanceOf[WhiteMage]

  override def equals(that: Any): Boolean = {
  if (canEqual(that)) {
    val other = that.asInstanceOf[WhiteMage]
    getName == other.getName &&
      getHealthPoints == other.getHealthPoints &&
      getDefense == other.getDefense &&
      getWeight == other.getWeight &&
      getManaPoints == other.getManaPoints &&
      getWeapon == other.getWeapon
  }
  else false
  }

  override def hashCode: Int = Objects.hash(classOf[WhiteMage],
    getName, getHealthPoints, getDefense, getWeight, getManaPoints, getWeapon)

  override def toString: String = s"WhiteMage {" +
    s"name: $getName, " +
    s"currentHealthPoints: $getHealthPoints, " +
    s"defense: $getDefense, " +
    s"weight: $getWeight, " +
    s"currentManaPoints: $getManaPoints, " +
    s"weapons: $getWeapon" +
    s"}"
}
