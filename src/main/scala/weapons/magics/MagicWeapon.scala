package weapons.magics

import weapons.Weapon

trait MagicWeapon extends Weapon {

  val magicAttackPoints: Int

  def getMagicAttackPoints: Int

}
