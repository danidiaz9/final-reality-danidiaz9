package characters

/** Trait representing a character.
 *
 * This trait defines the basic properties of a character in the game,
 * such as name, health points, defense, and weight.
 */
trait TCharacter {
  /** The name of the character.
   *
   * @return The name of the character.
   */
  val name: String

  /** The current health points of the character.
   *
   * @return The current health points of the character.
   */
  var healthPoints: Int

  /** The defense points of the character.
   *
   * @return The defense points of the character.
   */
  var defense: Int

  /** The weight of the character.
   *
   * @return The weight of the character.
   */
  val weight: Double
}
