package spells.light

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.WhiteMage

class Paralysis extends AbstractLightSpell {

  override val manaCost: Int = 25

  override def setSpellWhiteMage(whiteMage: WhiteMage): Unit = {
    whiteMage.equipParalysis(this)
  }

  override def applySpell(target: GameUnit, from: Character): Unit = {
    target.receiveAttack(from.getWeapon.get.magicAttackPoints)
  }

}
