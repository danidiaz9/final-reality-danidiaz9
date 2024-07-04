package model.effects

import model.gameunits.GameUnit
import model.gameunits.character.Character

class Paralyzed extends AbstractEffect {

  override def applyEffect(from: Character, target: GameUnit): Unit = {
    target.appliedEffect(this)
  }

}
