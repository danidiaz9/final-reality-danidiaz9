package model.spells.dark

import model.effects.{Effects, Effect, Paralyzed}
import model.gameunits.GameUnit
import model.gameunits.character.Character

import scala.util.Random

class Thunder extends AbstractDark {

  override val manaCost: Int = 20
  override val effect: Effect = new Effects(List[Paralyzed]())

  def applyThunderTo(target: GameUnit, from: Character): Unit = {
    target.receiveMagicDamage(from.getWeapon.get.getMagicAttackPoints)
    if (Random.nextDouble < 0.3){
      effect.applyEffect(from, target)
    }

  }

}
