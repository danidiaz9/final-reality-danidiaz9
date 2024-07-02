package controller.states

import model.gameunits.GameUnit
import model.gameunits.character.Character
import model.gameunits.character.magics.MagicCharacter
import model.spells.Spell
import model.weapons.Weapon

trait GameState {

  def initializeGame(): Unit
  def unitAttack(attacker: GameUnit, defender: GameUnit): Unit
  def castSpell(caster: MagicCharacter, spell: Spell, target: GameUnit): Unit
  def equipWeapon(character: Character, weapon: Weapon): Unit

}
