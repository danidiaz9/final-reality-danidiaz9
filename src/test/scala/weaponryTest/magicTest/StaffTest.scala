package weaponryTest.magicTest

import weaponry.weapons.magics.Staff
import characters.player.magics.{BlackWizard, WhiteWizard}

class StaffTest extends munit.FunSuite {

  var staff: Staff = _
  var blackWizard: BlackWizard = _
  var whiteWizard: WhiteWizard = _

  override def beforeEach(context: BeforeEach): Unit = {

    staff = new Staff("Magic Staff", 25, 6.0, None, 30)
    blackWizard = new BlackWizard("Gandalf", 150, 20, 80.0, 200, None)
    whiteWizard = new WhiteWizard("Saruman", 140, 18, 75.0, 190, None)

  }

  test("setBlackWizard should set the owner of the staff to a black wizard character") {
    staff.setBlackWizard(blackWizard)
    assertEquals(staff.owner, Some(blackWizard))
  }

  test("setWhiteWizard should set the owner of the staff to a white wizard character") {
    staff.setWhiteWizard(whiteWizard)
    assertEquals(staff.owner, Some(whiteWizard))
  }

}
