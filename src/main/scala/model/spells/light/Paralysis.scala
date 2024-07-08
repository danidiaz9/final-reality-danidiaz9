package model.spells.light

import model.effects.{Effects, Effect, Paralyzed}
import model.gameunits.GameUnit
import model.gameunits.character.Character

class Paralysis extends AbstractLight {

  override val manaCost: Int = 25
  override val effect: Effect = new Effects(List[Paralyzed]())

  def applyParalysisTo(target: GameUnit, from: Character): Unit = {
    effect.applyEffect(from, target)
  }

}
