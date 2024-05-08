package characters.player

import characters.TraitCharacter
import weaponry.TraitWeaponry

/** Trait representing a character.
 *
 * This trait defines the basic properties of a character in the game,
 * such as name, health points, defense, and weight.
 */
trait TraitPlayer extends TraitCharacter {

  def getWeapon: TraitWeaponry

  def setWeapon(_weapon: TraitWeaponry): Unit

}
