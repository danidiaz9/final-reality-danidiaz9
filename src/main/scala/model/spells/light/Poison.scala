package model.spells.light

import model.effects.{Effect, Poisoned}
import model.gameunits.GameUnit
import model.gameunits.character.Character

class Poison extends AbstractLight {

  override val manaCost: Int = 30
  override val effect: Effect = new Poisoned

  def applyPoisonTo(target: GameUnit, from: Character): Unit = {
    effect.applyEffect(from, target)
  }

}
