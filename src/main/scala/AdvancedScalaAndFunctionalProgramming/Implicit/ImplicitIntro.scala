package AdvancedScalaAndFunctionalProgramming.Implicit

object ImplicitIntro extends App {
  val pair = "Diwash" -> "19"

  case class Person(name: String) {
    def greet = s"Hi my name is $name"
  }

  implicit def fromStringToPerson(str: String): Person = Person(str)
  println("Peter".greet)  // println(fromStringToPerson("Peter").greet)



  // Implicit parameters
  def increment(x: Int)(implicit amount: Int) = x + amount
  implicit val defaultAmount: Int = 10

  increment(2)
  // NOT default args

}
