package charactersTest.magicTest

import characters.player.magics.WhiteWizard
import weaponry.TraitWeaponry
import weaponry.weapons.commons.Bow
import weaponry.weapons.magics.{Staff, Wand}

class WhiteWizardTest extends munit.FunSuite {

  class TestWhiteWizard(name: String, healthPoints: Int, defense: Int,
                        weight: Double, manaPoints: Int, weapon: Option[TraitWeaponry])
    extends WhiteWizard(name, healthPoints, defense, weight, manaPoints, weapon)

  var whiteWizard: TestWhiteWizard = _
  var bow: Bow = _
  var wand: Wand = _
  var staff: Staff = _

  override def beforeEach(context: BeforeEach): Unit = {
    whiteWizard = new TestWhiteWizard("Gandalf", 150, 30, 80.0, 100, None)
    bow = new Bow("Elven Bow", 100, 8.0, None)
    wand = new Wand("Magic Wand", 120, 7.0, None, 150)
    staff = new Staff("Holy Staff", 150, 12.0, None, 180)
  }

  test("getName returns correct name") {
    assertEquals(whiteWizard.getName, "Gandalf")
  }

  test("getHealthPoints returns correct health points") {
    assertEquals(whiteWizard.getHealthPoints, 150)
  }

  test("getDefense returns correct defense points") {
    assertEquals(whiteWizard.getDefense, 30)
  }

  test("getWeight returns correct weight") {
    assertEquals(whiteWizard.getWeight, 80.0)
  }

  test("getManaPoints returns correct mana points") {
    assertEquals(whiteWizard.getManaPoints, 100)
  }

  test("getWeapon returns None by default") {
    assertEquals(whiteWizard.getWeapon, None)
  }

  test("equipBow should equip a bow to the white wizard character") {
    whiteWizard.equipBow(bow)
    assertEquals(bow.owner, Some(whiteWizard))
  }

  test("equipWand should equip a wand to the white wizard character") {
    whiteWizard.equipWand(wand)
    assertEquals(wand.owner, Some(whiteWizard))
  }

  test("equipStaff should equip a staff to the white wizard character") {
    whiteWizard.equipStaff(staff)
    assertEquals(staff.owner, Some(whiteWizard))
  }

  test("toString returns expected string representation") {
    val expected = "WhiteWizard {name: Gandalf, healthPoints: 150, defense: 30, " +
      "weight: 80.0, manaPoints: 100, weapon: None}"
    assertEquals(whiteWizard.toString, expected)
  }

  test("equals method works correctly") {
    val sameWhiteWizard = new TestWhiteWizard("Gandalf", 150, 30, 80.0, 100, None)
    val differentWhiteWizard = new TestWhiteWizard("Saruman", 150, 30, 80.0, 100, None)

    assert(whiteWizard.equals(sameWhiteWizard))
    assert(!whiteWizard.equals(differentWhiteWizard))
  }

  test("hashCode method works correctly") {
    val sameWhiteWizard = new TestWhiteWizard("Gandalf", 150, 30, 80.0, 100, None)

    assertEquals(whiteWizard.hashCode(), sameWhiteWizard.hashCode())
  }

}
