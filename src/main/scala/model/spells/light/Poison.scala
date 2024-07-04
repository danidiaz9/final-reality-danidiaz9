package model.spells.light

import model.effects.{Effects, Effect, Poisoned}
import model.gameunits.GameUnit
import model.gameunits.character.Character

class Poison extends AbstractLight {

  override val manaCost: Int = 30
  override val effect: Effect = new Effects(List[Poisoned])

  def applyPoisonTo(target: GameUnit, from: Character): Unit = {
    effect.applyEffect(from, target)
  }

}
