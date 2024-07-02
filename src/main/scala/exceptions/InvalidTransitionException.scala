package exceptions

class InvalidTransitionException(details: String) extends Exception(s"An invalid transition was found -- $details")
