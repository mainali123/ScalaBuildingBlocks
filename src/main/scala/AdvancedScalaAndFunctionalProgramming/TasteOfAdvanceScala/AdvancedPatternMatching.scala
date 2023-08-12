package AdvancedScalaAndFunctionalProgramming.TasteOfAdvanceScala

object AdvancedPatternMatching extends App {

  // 1- Switch on steroids
  val aNumber = 44
  val ordinal = aNumber match
    case 1 => "First"
    case 2 => "Second"
    case 3 => "Third"
    case _ => aNumber + "th"

  // 2- Deconstruction of case classes
  case class Person(name: String, age: Int)
  val bob = Person("Bob", 21)

  val bobGreeting = bob match
    case Person(n, a) => s"Hi, my name is $n and I am $a years old."

  // trick #1 - List extractors
  val numberList = List(1, 2, 3, 42)

  val mustHaveThree = numberList match
    case List(_, _, 3, somethingElse) => s"List have third element 3 so the forth element is $somethingElse"

  // trick #2 - Haskell - like prepending
  val startsWithOne = numberList match
    case 1 :: tail => s"List starts with one, tail is $tail"

//----------------------------------------------------------------------------------------------------------------------

  val numbers = List(1)
  val description = numberList match
    case head :: Nil => println(s"The only element is $head")
    case _ =>

  /*
    - constants
    - wildcards
    - case classes
    - tuples
    - some special magic like above
  */

  class Person1(val name: String, val age: Int)

  object Person1 :
    def unapply(person: Person1): Option[(String, Int)] =
      if person.age < 21 then Some((person.name, person.age)) else None

    def unapply(age: Int): Option[String] = Some(if age < 21 then "Minor" else "Major")


  val bob1 = new Person1("Bob", 21)
  val greeting = bob1 match
    case Person1(n, a) => s"Hi, my name is $n and I am $a years old"
    case _ => "Age is more more than 20"

  println(greeting)


}
