package FunctionalProgramming.Chapter2

import scala.annotation.tailrec

object HigherOrderFunctions extends App {
  println(factorial(5))
  println(fiboacciNumber(19))
  println(formatResult("Absolute value", -45, absoluteValue)) // HOF
  println(formatResult("Factorial", 5, factorial))  // HOF
  println(formatResult("Fibonacci number", 19, fiboacciNumber)) // HOF
}

def factorial(n: Int): Int = {
  @tailrec  // Annotation for tail recursion gives error if it is not a tail recursion
  def calculate(x: Int, ans: Int): Int = if x <= 0 then ans else calculate(x - 1, ans * x)
  calculate(n, 1)
}

def absoluteValue(n: Int): Int = {
  n.abs
}

def formatResult(name: String, n: Int, f: Int => Int) = { // HOF
  val msg = "The %s of %d is %d"
  msg.format(name, n, f(n))
}

// Exercise 2.1
def fiboacciNumber(x: Int): Int = {
  if x <= 1 then x else fiboacciNumber(x - 1) + fiboacciNumber( x - 2)
}
