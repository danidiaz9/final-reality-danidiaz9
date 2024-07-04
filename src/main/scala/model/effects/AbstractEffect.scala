package model.effects

import model.gameunits.GameUnit
import model.gameunits.character.Character

abstract class AbstractEffect extends Effect {

  def applyEffect(from: Character, target: GameUnit): Unit = {
    target.appliedEffect(this)
  }

}
