package ScalaAndFunctionalProgrammingEssentials.ObjectOriented

object Exceptions extends App {

  val x: String = null
  //  println(x.length)
  // This ^^^^^^^^^^^ will crash with a NullPointerException

  // 1. Throwing exceptions
  //  val aWeirdValue: String = throw new NullPointerException

  // throwable classes extend the Throwable class.
  // Exception and Error are the major Throwable subtypes

  // 2. How to catch exceptions
  def getInt(withExceptions: Boolean): Int = {
    if (withExceptions) throw new RuntimeException("No int for you!")
    else 42
  }

  try {
    getInt(true)
  } catch {
    case e: RuntimeException => println("Caught a runtime exception")
  } finally {
    // COde that will be executed no matter what
    // Optional
    // doesn't influence the return type of this expression
    // use finally only for side effects
    println("Finally")


    // HOW TO DEFINE YOUR OWN EXCEPTIONS
    class MyException extends Exception
    val exception = new MyException

    //    throw exception
    /*
    1. Crash your program with an OutOfMemoryError
    2. Crash with StackOverflowError
    3. Pocket Calculator
      - add(x, y)
      - subtract(x, y)
      - multiply(x, y)
      - divide(x, y)

    Throw
      - OverflowException if add(x, y) exceeds Int.MAX_VALUE
      - UnderflowException if subtract(x, y) exceeds Int, MIN_VALUE
      - MathCalculationException for division by 0
    */

    try {
      val arr = new Array[Int](Int.MaxValue)
    } catch {
      case e: OutOfMemoryError => println("Out of Memory Error")
    }


    def recursiveFunction(n: Int): Int = {
      val largeArray = new Array[Int](1000000)
      if (n <= 0) 0
      else 1 + recursiveFunction(n - 1)
    }

    try {
      recursiveFunction(100000)
    } catch {
      case e: StackOverflowError => println(s"Lol stack is full and got $e.")
    }


    class OverflowException extends RuntimeException
    class UnderflowException extends RuntimeException
    class MathCalculationException extends RuntimeException

    object PocketCalculator {
      def add(x: Int, y: Int): Int = {
        val result = x + y
        if (result > Int.MaxValue) then throw new OverflowException
        else if result < Int.MinValue then throw new UnderflowException
        else result
      }

      def subtract(x: Int, y: Int): Int = {
        val result = x - y

        if (result > Int.MaxValue) then throw new OverflowException
        else if result < Int.MinValue then throw new UnderflowException
        else result
      }

      def multiply(x: Int, y: Int): Int = {
        val result = x * y

        if (result > Int.MaxValue) then throw new OverflowException
        else if result < Int.MinValue then throw new UnderflowException
        else result
      }

      def divide(x: Int, y: Int): Int = {
        if y == 0 then throw new MathCalculationException
        val result = x / y

        if (result > Int.MaxValue) then throw new OverflowException
        else if result < Int.MinValue then throw new UnderflowException
        else result
      }

      try {
        println(PocketCalculator.divide(1, 0))
      } catch {
        case e: MathCalculationException => println("Error " + e)
      }
    }
  }
}
