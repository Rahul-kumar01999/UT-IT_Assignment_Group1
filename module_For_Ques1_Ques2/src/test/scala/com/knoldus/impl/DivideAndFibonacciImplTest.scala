package com.knoldus.impl

import org.scalatest.flatspec.AnyFlatSpec

class DivideAndFibonacciImplTest extends AnyFlatSpec {

  val forValidatingDivideOpr =new DivideAndFibonacciImpl()
  val forValidatingFibonacciOpr =new DivideAndFibonacciImpl()

  // Test cases to validate divide method

  "A number 10" should "return 5 when divided by 2" in{

    assert(forValidatingDivideOpr.divide(10,2)==5)
  }

  it should "throw ArithmeticException when divided by 0" in{

    assertThrows[ArithmeticException] {
      forValidatingDivideOpr.divide(10,0)
    }
  }

  // Test cases to validate fibonacci method.

  "When user gives a positive number as the last term then it" should "generate the fibonacci series up to that term" in{
    val lastTerm=6
    assert(forValidatingFibonacciOpr.fibonacci(lastTerm).equals("0 1 1 2 3 5"))
  }

  "When user gives a negative number as last term then it" should "not accept that value and should print an error message" in{
    val lastElement= -10
    assert(forValidatingFibonacciOpr.fibonacci(lastElement).equals("Invalid Input"))
  }
}

