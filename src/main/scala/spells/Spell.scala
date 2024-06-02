package spells

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.{BlackMage, MagicCharacter, WhiteMage}

/** A trait representing spells in the game.
 *
 *  Spells include attributes such as mana cost and methods for applying spells to targets.
 */
trait Spell {

  /** The mana cost of the spell. */
  val manaCost: Int

  /** Returns the mana cost of the spell.
   *
   *  @return The mana cost of the spell.
   */
  def getManaCost: Int

  /** Sets the mage who can cast the spell.
   *
   *  @param m The mage who can cast the spell.
   */
  def setMage(m: MagicCharacter): Unit

  /** Sets the BlackMage who can cast the spell.
   *
   *  @param blackMage The BlackMage who can cast the spell.
   */
  def setSpellBlackMage(blackMage: BlackMage): Unit

  /** Sets the WhiteMage who can cast the spell.
   *
   *  @param whiteMage The WhiteMage who can cast the spell.
   */
  def setSpellWhiteMage(whiteMage: WhiteMage): Unit

  /** Returns the mage who can cast the spell.
   *
   *  @return The mage who can cast the spell.
   */
  def getMage: Option[MagicCharacter]

  /** Applies the spell to the target.
   *
   *  @param target The target on which the spell is applied.
   *  @param from The character casting the spell.
   */
  def applySpell(target: GameUnit, from: Character): Unit

}
