package gameunits

import exceptions.InvalidSpellException
import gameunits.character.Character
import spells.dark.{Fire, Thunder}
import spells.light.{Paralysis, Poison}

import java.util.Objects

/** A class representing an enemy character in the game.
 *
 *  @constructor Creates a new enemy with the specified name, health points, attack points, defense, and weight.
 *  @param name The name of the enemy.
 *  @param maxHealthPoints The maximum health points of the enemy.
 *  @param currentHealthPoints The current health points of the enemy.
 *  @param attackPoints The attack points of the enemy.
 *  @param defense The defense points of the enemy.
 *  @param weight The weight of the enemy.
 */
class Enemy(name: String,
            maxHealthPoints: Int,
            currentHealthPoints: Int,
            attackPoints: Int,
            defense: Int,
            weight: Double) extends
            AbstractUnit(name, maxHealthPoints, currentHealthPoints, attackPoints, defense, weight) {

  /** Attack another game unit.
   *
   *  @param gameUnit The game unit to attack.
   */
  override def attack(gameUnit: GameUnit): Unit = {
    gameUnit.receiveAttack(this.getAttackPoints)
  }

  /** Receive an attack and reduce health points accordingly.
   *
   *  @param damage The amount of damage received.
   */
  override def receiveAttack(damage: Int): Unit = {
    val characterDamage = damage - this.getDefense
    this.setHealthPoints(this.getHealthPoints - characterDamage)
  }

  /** Receive fire damage from a spell.
   *
   *  @param fire The fire spell to receive.
   *  @param from The character who cast the spell.
   *  @throws InvalidSpellException if the unit is dead.
   */
  override def receiveFire(fire: Fire, from: Character): Unit = {
    if (0 < this.getHealthPoints){
      fire.applySpell(this, from)
    }
    else {
      throw new InvalidSpellException("Unit is dead.")
    }
  }

  /** Receive thunder damage from a spell.
   *
   *  @param thunder The thunder spell to receive.
   *  @param from The character who cast the spell.
   *  @throws InvalidSpellException if the unit is dead.
   */
  override def receiveThunder(thunder: Thunder, from: Character): Unit = {
    if (0 < this.getHealthPoints){
      thunder.applySpell(this, from)
    }
    else {
      throw new InvalidSpellException("Unit is dead.")
    }
  }

  /** Receive paralysis from a spell.
   *
   *  @param paralysis The paralysis spell to receive.
   *  @param from The character who cast the spell.
   *  @throws InvalidSpellException if the unit is dead.
   */
  override def receiveParalysis(paralysis: Paralysis, from: Character): Unit = {
    if (0 < this.getHealthPoints){
      paralysis.applySpell(this, from)
    }
    else {
      throw new InvalidSpellException("Unit is dead.")
    }
  }

  /** Receive poison from a spell.
   *
   *  @param poison The poison spell to receive.
   *  @param from The character who cast the spell.
   *  @throws InvalidSpellException if the unit is dead.
   */
  override def receivePoison(poison: Poison, from: Character): Unit = {
    if (0 < this.getHealthPoints){
      poison.applySpell(this, from)
    }
    else {
      throw new InvalidSpellException("Unit is dead.")
    }
  }

  def canEqual(that: Any): Boolean = that.isInstanceOf[Enemy]

  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Enemy]
      getName == other.getName &&
      getHealthPoints == other.getHealthPoints &&
      getAttackPoints == other.getAttackPoints &&
      getDefense == other.getDefense &&
      getWeight == other.getWeight
    }
    else false
  }

  override def hashCode: Int = Objects.hash(classOf[Enemy],
    getName, getHealthPoints, getAttackPoints, getDefense, getWeight)

  override def toString: String = s"Enemy {" +
    s"name: $getName, " +
    s"currentHealthPoints: $getHealthPoints, " +
    s"attackPoints: $getAttackPoints, " +
    s"defense: $getDefense, " +
    s"weight: $getWeight" +
    s"}"
}
