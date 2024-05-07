package weaponry

import characters.player.TraitPlayer

/** A trait representing weaponry in the game.
 *
 *  Weaponry includes attributes such as name, attack points, weight, and owner.
 */
trait TraitWeaponry {

  /** The name of the weapon. */
  val _name: String

  /** The attack points of the weapon. */
  val _attackPoints: Int

  /** The weight of the weapon. */
  val _weight: Double

  /** The owner of the weapon. */
  var _owner: TraitPlayer

  /** Returns the name of the weapon.
   *
   *  @return The name of the weapon.
   */
  def getName: String

  /** Returns the attack points of the weapon.
   *
   *  @return The attack points of the weapon.
   */
  def getAttackPoints: Int

  /** Returns the weight of the weapon.
   *
   *  @return The weight of the weapon.
   */
  def getWeight: Double

  /** Returns the owner of the weapon.
   *
   *  @return The owner of the weapon.
   */
  def getOwner: TraitPlayer

  /** Sets the owner of the weapon.
   *
   *  @param owner The owner of the weapon.
   */
  def setOwner(owner: TraitPlayer): Unit

}
