package spells.dark

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.BlackMage

class Fire extends AbstractDarkSpell {

  override val manaCost: Int = 15

  override def setSpellBlackMage(blackMage: BlackMage): Unit = {
    blackMage.equipFire(this)
  }

  override def applySpell(target: GameUnit, from: Character): Unit = {
    target.receiveAttack(from.getWeapon.get.magicAttackPoints)
  }

}
