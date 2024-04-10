package charactersTest.magicTest

import characters.magic.BlackWizard

class BlackWizardTest extends munit.FunSuite {

  test("BlackWizard equality") {
    val wizard1 = new BlackWizard("Gandalf", 120, 80, 70, 100)
    val wizard2 = new BlackWizard("Gandalf", 120, 80, 70, 100)
    val wizard3 = new BlackWizard("Saruman", 110, 75, 65, 90)

    assertEquals(wizard1, wizard2)
    assertNotEquals(wizard1, wizard3)
  }

  test("BlackWizard hash code") {
    val wizard1 = new BlackWizard("Gandalf", 120, 80, 70, 100)
    val wizard2 = new BlackWizard("Gandalf", 120, 80, 70, 100)

    assertEquals(wizard1.hashCode(), wizard2.hashCode())
  }

  test("BlackWizard toString") {
    val wizard = new BlackWizard("Gandalf", 120, 80, 70, 100)
    val expectedString = "BlackWizard {name: Gandalf, healthPoints: 120, defense: 80, " +
      "weight: 70, manaPoints: 100}"

    assertEquals(wizard.toString(), expectedString)
  }
}
