package ScalaAndFunctionalProgrammingEssentials.AbsoluteScalaBasics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWIthSideEffects(aString: String): Unit = println(aString)


  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b

    aSmallFunction(n, n - 1)
  }

  /*Questions
  1. A greeting function (name, age) -> "Hi, my name is $name and I am $age years old."
  2. Factorial function 1 * 2 * 3 * ... * n
  3. A Fibonacci function
  4. If a number is prime
  */

  // question1
  def greeting(name: String, age: Int) = {
    s"Hi, my name is $name and I am $age years old."
  }

  // question2
  def factorial(n: Int): Int = {
    if (n == 1) 1 else n * factorial(n - 1)
  }

  // question3
  def fibonacci(n: Int): Int = {
    if (n < 2) n else fibonacci(n - 1) + fibonacci(n - 2)
  }

  // question4
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (n <= 1) true else (n % t !=0 && isPrimeUntil(t-1))
    }
    isPrimeUntil(n / 2)
  }
}
