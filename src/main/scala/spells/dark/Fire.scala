package spells.dark

import gameunits.GameUnit
import gameunits.character.magics.BlackMage

class Fire(manaCost: Int) extends AbstractDarkSpell(manaCost) {

  override def fireSpell(blackMage: BlackMage): Unit = {
    blackMage.useFire(this)
  }

  override def applySpell(target: GameUnit): Unit = {
    target.receiveFire(this)
  }

}
