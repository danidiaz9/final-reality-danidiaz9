package weaponryTest.magicTest

import weaponry.weapons.magics.Wand
import characters.player.commons.Ninja
import characters.player.magics.{BlackWizard, WhiteWizard}

class WandTest extends munit.FunSuite {

  var wand: Wand = _
  var ninja: Ninja = _
  var blackWizard: BlackWizard = _
  var whiteWizard: WhiteWizard = _

  override def beforeEach(context: BeforeEach): Unit = {

    wand = new Wand("Magic Wand", 20, 3.5, None, 25)
    ninja = new Ninja("Ryu", 120, 15, 70.0, None)
    blackWizard = new BlackWizard("Gandalf", 150, 20, 80.0, 200, None)
    whiteWizard = new WhiteWizard("Saruman", 140, 18, 75.0, 190, None)

  }

  test("setNinja should set the owner of the wand to a ninja character") {
    wand.setNinja(ninja)
    assertEquals(wand.owner, Some(ninja))
  }

  test("setBlackWizard should set the owner of the wand to a black wizard character") {
    wand.setBlackWizard(blackWizard)
    assertEquals(wand.owner, Some(blackWizard))
  }

  test("setWhiteWizard should set the owner of the wand to a white wizard character") {
    wand.setWhiteWizard(whiteWizard)
    assertEquals(wand.owner, Some(whiteWizard))
  }

}
