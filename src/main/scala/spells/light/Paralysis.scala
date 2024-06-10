package spells.light

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.WhiteMage

/** A class representing the Paralysis spell in the game.
 *
 *  The Paralysis spell is a type of light spell that can be cast by a White Mage.
 *  It requires a certain amount of mana to cast and applies an attack to the target unit.
 */
class Paralysis extends AbstractLightSpell {

  /** The mana cost required to cast the Paralysis spell. */
  override val manaCost: Int = 25

  /** Sets the Paralysis spell to a White Mage.
   *
   *  @param whiteMage The White Mage to equip with the Paralysis spell.
   */
  override def setSpellWhiteMage(whiteMage: WhiteMage): Unit = {
    whiteMage.equipParalysis(this)
  }

  /** Applies the Paralysis spell to a target unit.
   *
   *  @param target The target unit that the spell is applied to.
   *  @param from The character casting the spell.
   */
  override def applySpell(target: GameUnit, from: Character): Unit = {
    target.receiveDamage(from.getWeapon.get.magicAttackPoints)
  }

}
