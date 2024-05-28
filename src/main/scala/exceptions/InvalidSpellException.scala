package exceptions

class InvalidSpellException(details: String) extends Exception(s"An invalid spell was found -- $details") {

}
