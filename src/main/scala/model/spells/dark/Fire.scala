package model.spells.dark

import model.effects.{Burned, Effect}
import model.gameunits.GameUnit
import model.gameunits.character.Character

import util.Random

class Fire extends AbstractDark {

  override val manaCost: Int = 15
  override val effect: Effect = new Burned

  def applyFireTo(target: GameUnit, from: Character): Unit = {
    target.receiveMagicDamage(from.getWeapon.get.getMagicAttackPoints)
    if (Random.nextDouble < 0.2){
      effect.applyEffect(from, target)
    }

  }

}
