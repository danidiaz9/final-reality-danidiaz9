package characters

/** An abstract class representing a character in the game.
 *
 *  @constructor Creates a new character with the specified name, health points, defense, and weight.
 *  @param _name The name of the character.
 *  @param _healthPoints The current health points of the character.
 *  @param _defense The defense points of the character.
 *  @param _weight The weight of the character.
 */
abstract class AbstractCharacter(val _name: String,
                        var _healthPoints: Int,
                        var _defense: Int,
                        val _weight: Double) extends TraitCharacter {

  var actionBar: Double = 0.0

  /** Returns the name of the character.
   *
   *  @return The name of the character.
   */
  def getName: String = _name

  /** Returns the current health points of the character.
   *
   *  @return The current health points of the character.
   */
  def getHealthPoints: Int = _healthPoints

  /** Returns the defense points of the character.
   *
   *  @return The defense points of the character.
   */
  def getDefense: Int = _defense

  /** Returns the weight of the character.
   *
   *  @return The weight of the character.
   */
  def getWeight: Double = _weight

  /** Returns the action bar of the character.
   *
   *  @return The action bar of the character.
   */
  def getActionBar: Double = actionBar

  /** Calculates the maximum action bar value for the character based on its weight.
   *
   *  @return The maximum action bar value.
   */
  def calculateMaxActionBar: Double = {
    val charWeight = this.getWeight
    val maxActionBar = charWeight
    maxActionBar

  }

}
