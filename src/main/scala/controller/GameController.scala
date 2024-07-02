package controller

import controller.states.GameState
import controller.states.InitialState
import model.gameunits.GameUnit
import model.gameunits.character.Character
import model.gameunits.character.magics.MagicCharacter
import model.spells.Spell
import model.weapons.Weapon

class GameController {

  var state: GameState = new initialState(this)

  def initializeGame(): Unit = {
    state.initializeGame()
  }

  def unitAttack(attacker: GameUnit, defender: GameUnit): Unit = {
    state.unitAttack(attacker, defender)
  }

  def castSpell(caster: MagicCharacter, spell: Spell, target: GameUnit): Unit = {
    state.castSpell(caster, spell, target)
  }

  def equipWeapon(character: Character, weapon: Weapon): Unit = {
    state.equipWeapon(character, weapon)
  }

}
