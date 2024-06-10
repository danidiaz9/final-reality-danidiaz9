package spells.dark

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.BlackMage

/** A class representing the Thunder spell in the game.
 *
 *  The Thunder spell is a type of dark spell that can be cast by a BlackMage.
 *  It requires a specific amount of mana to cast and deals magic damage to the target.
 */
class Thunder extends AbstractDarkSpell {

  /** The mana cost required to cast the Thunder spell. */
  override val manaCost: Int = 20

  /** Sets the Thunder spell to be cast by a BlackMage.
   *
   *  @param blackMage The BlackMage who will cast the Thunder spell.
   */
  override def setSpellBlackMage(blackMage: BlackMage): Unit = {
    blackMage.equipThunder(this)
  }

  /** Applies the Thunder spell to the target.
   *
   *  The spell inflicts magic damage based on the caster's magic attack points.
   *
   *  @param target The target of the Thunder spell.
   *  @param from The character casting the Thunder spell.
   */
  override def applySpell(target: GameUnit, from: Character): Unit = {
    target.receiveDamage(from.getWeapon.get.magicAttackPoints)
  }

}
