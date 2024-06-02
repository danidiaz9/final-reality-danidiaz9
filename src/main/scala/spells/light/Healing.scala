package spells.light

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.WhiteMage

/** A class representing the Healing spell in the game.
 *
 *  The Healing spell is a type of light spell that can be cast by a White Mage.
 *  It requires a certain amount of mana to cast and applies healing to the target unit.
 */
class Healing extends AbstractLightSpell {

  /** The mana cost required to cast the Healing spell. */
  override val manaCost: Int = 15

  /** Sets the Healing spell to a White Mage.
   *
   *  @param whiteMage The White Mage to equip with the Healing spell.
   */
  override def setSpellWhiteMage(whiteMage: WhiteMage): Unit = {
    whiteMage.equipHealing(this)
  }

  /** Applies the Healing spell to a target unit.
   *
   *  @param target The target unit that the spell is applied to.
   *  @param from The character casting the spell.
   */
  override def applySpell(target: GameUnit, from: Character): Unit = {
    target.receiveHealing(this)
  }

}
