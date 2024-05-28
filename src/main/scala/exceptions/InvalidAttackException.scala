package exceptions

/** Custom exception to signal an invalid attackCharacter encountered.
 *
 * This exception is designed to provide specific feedback about
 * invalid attacks in the game. For instance, if a character attempts to
 * attackCharacter an ally of the same type, this exception could be thrown with a
 * detailed message indicating the nature of the problem.
 *
 * @example To throw the exception with specific details:
 * {{{
 * throw new InvalidAttackException("A character cannot attackCharacter an ally of the same type.")
 * // => InvalidAttackException: An invalid attackCharacter was found -- A character cannot attackCharacter an ally of the same type.
 * }}}
 *
 * @param details A descriptive message detailing the nature of the invalid attackCharacter.
 */

class InvalidAttackException(details: String) extends Exception(s"An invalid attackCharacter was found -- $details")