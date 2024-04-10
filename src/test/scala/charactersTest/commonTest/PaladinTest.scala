package charactersTest.commonTest

import characters.common.Paladin

class PaladinTest extends munit.FunSuite {

  test("Paladin equality") {
    val paladin1 = new Paladin("Arthur", 120, 90, 80)
    val paladin2 = new Paladin("Arthur", 120, 90, 80)
    val paladin3 = new Paladin("Lancelot", 110, 85, 75)

    assertEquals(paladin1, paladin2)
    assertNotEquals(paladin1, paladin3)
  }

  test("Paladin hash code") {
    val paladin1 = new Paladin("Arthur", 120, 90, 80)
    val paladin2 = new Paladin("Arthur", 120, 90, 80)

    assertEquals(paladin1.hashCode(), paladin2.hashCode())
  }

  test("Paladin toString") {
    val paladin = new Paladin("Arthur", 120, 90, 80)
    val expectedString = "Paladin {name: Arthur, healthPoints: 120, defense: 90, weight: 80}"

    assertEquals(paladin.toString(), expectedString)
  }
}
