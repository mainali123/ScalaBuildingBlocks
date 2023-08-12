package AdvancedScalaAndFunctionalProgramming.AdvancedFunctionalProgramming

object PartialFunctions extends App {

  val aFunction = (x: Int) => x + 1 // Function1[Int, Int] === Int => Int

  val aFussyFunction = (x: Int) =>
    if x == 1 then 42
    else if x == 2 then 56
    else if x == 5 then 999
    else throw new FunctionNotApplicableException

  class FunctionNotApplicableException extends RuntimeException:
    override def toString: String = "Function is not applicable"


  val aNicerFussyFunction = (x: Int) =>
    x match
      case 1 => 42
      case 2 => 56
      case 5 => 999
  // {1, 2, 5} => Int

  val aPartialFunction: PartialFunction[Int, Int] = { // Takes an Integer input and returns Integer
    case 1 => 42
    case 2 => 56
    case 5 => 999
  } // Partial function value

  println(aPartialFunction(2))
  println(aPartialFunction.isDefinedAt(4)) // Returns boolean value: weather the number is present or not in the pattern matching

  // lift
  val lift = aPartialFunction.lift // Int => Option[Int]
  println(lift(2)) // Some(56)
  println(lift(4)) // None

  // Chaining Partial Function
  val pfChain = aPartialFunction.orElse[Int, Int] {
    case 4 => 29
  }
  println(pfChain(2)) // 56
  println(pfChain(4)) // 29

  val aTotalFunction: Int => Int = {  // Takes Int as an argument and returns Int
    case 1 => 99
  }

  // HOF accepts partial functions as well
  def aMappedList = List(1, 2, 3).map {
    case 1 => 40
    case 2 => 41
    case 3 => 42
  }
  println(aMappedList)

  /*
  Note: PF can only have one parameter type
  */

  /*Exercises
  *
  * 1- Construct a PF instance of yourself (anonymous class)
  * 2- dumb chatbot as a PF
  */

  // 1.
  val aManualFussyFunction = new PartialFunction[Int, Int]:
    override def apply(x: Int): Int = x match
      case 1 => 40
      case 2 => 41
      case 3 => 42
    override def isDefinedAt(x: Int): Boolean = x == 1 || x == 2 || x == 3

  // 2.
  val chatBot: PartialFunction[String, String] =
      case "Hello" => "Hi"
      case "Hi" => "Hello"
      case "name" => "Diwash Mainali"
      case _ => "As a coded bot, I am unable to answer your question."

//  scala.io.Source.stdin.getLines().foreach(line => println("Chat bot says: " + chatBot(line)))
  scala.io.Source.stdin.getLines().map(chatBot).foreach(println)
}
