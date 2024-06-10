package spells.dark

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.BlackMage

/** A class representing the Fire spell in the game.
 *
 *  The Fire spell is a type of dark spell that can be cast by a BlackMage.
 *  It requires a specific amount of mana to cast and deals magic damage to the target.
 */
class Fire extends AbstractDarkSpell {

  /** The mana cost required to cast the Fire spell. */
  override val manaCost: Int = 15

  /** Sets the Fire spell to be cast by a BlackMage.
   *
   *  @param blackMage The BlackMage who will cast the Fire spell.
   */
  override def setSpellBlackMage(blackMage: BlackMage): Unit = {
    blackMage.equipFire(this)
  }

  /** Applies the Fire spell to the target.
   *
   *  The spell inflicts magic damage based on the caster's magic attack points.
   *
   *  @param target The target of the Fire spell.
   *  @param from The character casting the Fire spell.
   */
  override def applySpell(target: GameUnit, from: Character): Unit = {
    target.receiveDamage(from.getWeapon.get.magicAttackPoints)
  }

}
