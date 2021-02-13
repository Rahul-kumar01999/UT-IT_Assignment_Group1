package com.knoldus.validator

import java.util.regex.{Matcher, Pattern}

class EmailValidator {
  val emailRegex: String = "^[_A-Za-z0-9]+@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
  val pattern: Pattern =Pattern.compile(emailRegex)

  // this method will match the emailId format in the Regex pattern and will return true if it matches, false otherwise.
  def emailIdIsValid(emailId: String): Boolean = {
    val matcher:Matcher = pattern.matcher(emailId)
    matcher.matches
  }
}
