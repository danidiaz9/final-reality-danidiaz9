package model.spells.light

import model.gameunits.GameUnit
import model.gameunits.character.Character

class Healing extends AbstractLight {

  override val manaCost: Int = 15

  def applyHealingTo(target: GameUnit, from: Character): Unit = {
    target.receiveHealing()
  }

}
