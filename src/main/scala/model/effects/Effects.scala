package model.effects

import model.gameunits.GameUnit
import model.gameunits.character.Character

class Effects(val effect: List[Effect]) extends AbstractEffect {
  override def applyEffect(from: Character, target: GameUnit): Unit = {
    effect.foreach(e => e.applyEffect(from, target))
  }

}
