package spells.light

import gameunits.GameUnit
import gameunits.character.Character
import gameunits.character.magics.WhiteMage

class Poison extends AbstractLightSpell {

  override val manaCost: Int = 30

  override def setSpellWhiteMage(whiteMage: WhiteMage): Unit = {
    whiteMage.equipPoison(this)
  }

  override def applySpell(target: GameUnit, from: Character): Unit = {
    target.receiveAttack(from.getWeapon.get.magicAttackPoints)
  }

}
