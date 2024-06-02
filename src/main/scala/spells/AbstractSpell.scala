package spells

import exceptions.InvalidSpellException
import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.{BlackMage, MagicCharacter, WhiteMage}

/** An abstract class representing a spell in the game.
 *
 *  This abstract class provides the basic implementation for a spell, including
 *  methods for getting mana cost, setting and getting the mage, and applying the spell.
 */
abstract class AbstractSpell extends Spell {


  /** Returns the mana cost of the spell.
   *
   *  @return The mana cost of the spell.
   */
  def getManaCost: Int = manaCost

  /** The mage who can cast the spell, if any. */
  private var mage: Option[MagicCharacter] = None

  /** Sets the mage who can cast the spell.
   *
   *  @param m The mage who can cast the spell.
   */
  def setMage(m: MagicCharacter): Unit = {
    mage = Some(m)
  }

  /** Throws an InvalidSpellException when trying to set a BlackMage as the caster.
   *
   *  @param blackMage The BlackMage who cannot cast the spell.
   *  @throws InvalidSpellException Always thrown when this method is called.
   */
  def setSpellBlackMage(blackMage: BlackMage): Unit =
    throw new InvalidSpellException("Spell cannot be setting in this character.")

  /** Throws an InvalidSpellException when trying to set a WhiteMage as the caster.
   *
   *  @param whiteMage The WhiteMage who cannot cast the spell.
   *  @throws InvalidSpellException Always thrown when this method is called.
   */
  def setSpellWhiteMage(whiteMage: WhiteMage): Unit =
    throw new InvalidSpellException("Spell cannot be setting in this character.")

  /** Returns the mage who can cast the spell.
   *
   *  @return The mage who can cast the spell, if any.
   */
  def getMage: Option[MagicCharacter] = mage

  /** Throws an InvalidSpellException when trying to apply the spell to a target.
   *
   *  @param target The target on which the spell cannot be applied.
   *  @param from The character trying to cast the spell.
   *  @throws InvalidSpellException Always thrown when this method is called.
   */
  def applySpell(target: GameUnit, from: Character): Unit =
    throw new InvalidSpellException("Invalid target.")

}
