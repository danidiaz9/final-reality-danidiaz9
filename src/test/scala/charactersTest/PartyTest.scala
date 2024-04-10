package charactersTest

import characters.Party
import characters.common.Warrior
import characters.magic.WhiteWizard

class PartyTest extends munit.FunSuite {

  test("Party adds characters correctly") {
    val party = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0)
    val wizard = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)

    party.addCharacter(warrior)
    party.addCharacter(wizard)

    assertEquals(party.characters, Seq(warrior, wizard))
  }

  test("Party status: Alive") {
    val party = new Party()
    val warrior = new Warrior("Conan", 150, 100, 90.0)
    val wizard = new WhiteWizard("Gandalf", 120, 80, 70.0, 100)

    party.addCharacter(warrior)
    party.addCharacter(wizard)

    party.partyStatus()

    assert(clue(party.toString()).contains("Alive Party"))
  }

  test("Party status: Defeated") {
    val party = new Party()
    val warrior = new Warrior("Conan", 0, 100, 90.0)
    val wizard = new WhiteWizard("Gandalf", 0, 80, 70.0, 100)

    party.addCharacter(warrior)
    party.addCharacter(wizard)

    party.partyStatus()

    assert(clue(party.toString()).contains("Defeated Party"))
  }
}
