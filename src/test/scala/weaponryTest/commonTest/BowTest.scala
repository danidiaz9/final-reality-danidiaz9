package weaponryTest.commonTest

import weaponry.weapons.commons.Bow
import characters.player.commons.{Ninja, Warrior}
import characters.player.magics.WhiteWizard

class BowTest extends munit.FunSuite {

  var bow: Bow = _
  var warrior: Warrior = _
  var ninja: Ninja = _
  var whiteWizard: WhiteWizard = _

  override def beforeEach(context: BeforeEach): Unit = {

    bow = new Bow("Longbow", 25, 6.0, None)
    warrior = new Warrior("Conan", 120, 15, 90.0, None)
    ninja = new Ninja("Ryu", 100, 12, 80.0, None)
    whiteWizard = new WhiteWizard("Gandalf", 150, 20, 100.0, 200, None)

  }

  test("setWarrior should set the owner of the bow to a warrior character") {
    bow.setWarrior(warrior)
    assertEquals(bow.owner, Some(warrior))
  }

  test("setNinja should set the owner of the bow to a ninja character") {
    bow.setNinja(ninja)
    assertEquals(bow.owner, Some(ninja))
  }

  test("setWhiteWizard should set the owner of the bow to a white wizard character") {
    bow.setWhiteWizard(whiteWizard)
    assertEquals(bow.owner, Some(whiteWizard))
  }

}
