package model.effects
import model.gameunits.GameUnit
import model.gameunits.character.Character

class Burned extends AbstractEffect {

  override def applyEffect(from: Character, target: GameUnit): Unit = {
    target.receiveMagicDamage(from.getWeapon.get.getMagicAttackPoints/2)
    target.appliedEffect(this)
  }

}
