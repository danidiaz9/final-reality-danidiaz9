package model.effects

import model.gameunits.GameUnit
import model.gameunits.character.Character

trait Effect {

  def applyEffect(from: Character, target: GameUnit): Unit

}
