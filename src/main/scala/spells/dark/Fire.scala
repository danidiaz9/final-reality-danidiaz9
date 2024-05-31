package spells.dark

import gameunits.character.magics.BlackMage

class Fire extends AbstractDarkSpell {

  val manaCost: Int = 15

  override def fireSpell(blackMage: BlackMage): Unit = {
    blackMage.useFire(this)
  }

}
