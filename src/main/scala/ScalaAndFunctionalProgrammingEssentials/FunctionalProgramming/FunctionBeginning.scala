package ScalaAndFunctionalProgrammingEssentials.FunctionalProgramming

object FunctionBeginning extends App {

  // DREAM: Use functions as first class elements
  // PROBLEM: OOP

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  // function types = Function1[A, B]

  val stringToIntConverter = new Function1[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverter("3") + 4)

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }

  // Function types Function2[A, B, R] === (A, B) => R;   R is the return type

  // ALL SCALA FUNCTION ARE OBJECTS

  /*
  * 1. A function which takes 2 string and concatenates them.
  * 2. Define a function which takes an argument an int and returns another function which takes an int and returns an int.
  *   - what's the type of this function
  *   - How to do it*/

  // Question 1
  def  concatString: (String, String) => String = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }

  println(concatString("Diwash", "Mainali"))

  // Question 2
  val supperAdder: Function1[Int, Function1[Int, Int]] = new Function[Int, Function1[Int, Int]] {
    override def apply(v1: Int): Function1[Int, Int] = new Function[Int, Int] {
      override def apply(v2: Int): Int = v1 + v2
    }
  }

  val adder3 = supperAdder(3)
  println(adder3(4))
  println(supperAdder(3)(4))  // curried function
}

trait MyFunction[A, B] {
  def apply(element: A): B = ???
}