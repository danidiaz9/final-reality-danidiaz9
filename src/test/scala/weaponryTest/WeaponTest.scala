package weaponryTest

import weaponry.Weapon

class WeaponTest extends munit.FunSuite {

  test("Weapon equality") {
    val weapon1 = new Weapon("Sword", 50, 10, None)
    val weapon2 = new Weapon("Sword", 50, 10, None)
    val weapon3 = new Weapon("Axe", 60, 12, None)

    assertEquals(weapon1, weapon2)
    assertNotEquals(weapon1, weapon3)
  }

  test("Weapon hash code") {
    val weapon1 = new Weapon("Sword", 50, 10, None)
    val weapon2 = new Weapon("Sword", 50, 10, None)

    assertEquals(weapon1.hashCode(), weapon2.hashCode())
  }

  test("Weapon toString") {
    val weapon = new Weapon("Sword", 50, 10, None)
    val expectedString = "Weapon {name: Sword, attackPoints: 50, weight: 10, owner: None}"

    assertEquals(weapon.toString(), expectedString)
  }
}
