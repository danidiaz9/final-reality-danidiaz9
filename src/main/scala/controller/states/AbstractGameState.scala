package controller.states

import model.gameunits.GameUnit
import model.gameunits.character.Character
import model.gameunits.character.magics.MagicCharacter
import model.spells.Spell
import model.weapons.Weapon

abstract class AbstractGameState extends GameState {

  def initializeGame(): Unit = {
    println("Initializing the game...")
  }

  def unitAttack(attacker: GameUnit, defender: GameUnit): Unit = {
    println("Cannot attack, game not initialized.")
  }

  def castSpell(caster: MagicCharacter, spell: Spell, target: GameUnit): Unit = {
    println("Cannot cast spell, game not initialized.")
  }

  def equipWeapon(character: Character, weapon: Weapon): Unit = {
    println("Cannot equip weapon, game not initialized.")
  }

}
