package spells.light

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.WhiteMage

/** A class representing the Poison spell in the game.
 *
 *  The Poison spell is a type of light spell that can be cast by a White Mage.
 *  It requires a certain amount of mana to cast and applies an attack to the target unit.
 */
class Poison extends AbstractLightSpell {

  /** The mana cost required to cast the Poison spell. */
  override val manaCost: Int = 30

  /** Sets the Poison spell to a White Mage.
   *
   *  @param whiteMage The White Mage to equip with the Poison spell.
   */
  override def setSpellWhiteMage(whiteMage: WhiteMage): Unit = {
    whiteMage.equipPoison(this)
  }

  /** Applies the Poison spell to a target unit.
   *
   *  @param target The target unit that the spell is applied to.
   *  @param from The character casting the spell.
   */
  override def applySpell(target: GameUnit, from: Character): Unit = {
    target.receiveDamage(from.getWeapon.get.magicAttackPoints)
  }

}
