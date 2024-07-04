package model.effects

import model.gameunits.GameUnit
import model.gameunits.character.Character

class Poisoned extends AbstractEffect {

  override def applyEffect(from: Character, target: GameUnit): Unit = {
    target.receiveMagicDamage(from.getWeapon.get.getMagicAttackPoints/3)
    target.appliedEffect(this)
  }

}
