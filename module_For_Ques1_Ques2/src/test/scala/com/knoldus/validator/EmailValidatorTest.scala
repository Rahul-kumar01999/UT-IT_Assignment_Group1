package com.knoldus.validator

import com.knoldus.models.Email
import com.knoldus.validators.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec{

  val emailValidator:EmailValidator=new EmailValidator()

  "This Email" should "be valid as it is written in correct format" in{

    val email:Email=new Email("rahulSah@gmail.com")
    assert(emailValidator.isEmailValid(email))
  }

  it should "not valid as it contains blank space" in{

    val email:Email=new Email("rahul 01999@gmail.com.net") // blank space not allowed.
    assert(!emailValidator.isEmailValid(email))
  }

  it should "also not valid as it contains two or more dot symbols" in{

    val email:Email=new Email("rahul01999@gmail..com") // two dots are not allowed.
    assert(!emailValidator.isEmailValid(email))
  }

  it should "also not valid as it does not contain @ symbol" in{

    val email:Email=new Email("rahulSah.com") // here @ symbol is missing.
    assert(!emailValidator.isEmailValid(email))
  }
}
