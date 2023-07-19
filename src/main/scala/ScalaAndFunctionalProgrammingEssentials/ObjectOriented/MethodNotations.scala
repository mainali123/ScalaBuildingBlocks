package ScalaAndFunctionalProgrammingEssentials.ObjectOriented

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriateMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = {
      movie == favoriateMovie
    }

    def +(person: Person): String = {
      s"${this.name} is hanging with ${person.name}"
    }

    // overload
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriateMovie)

    def unary_! : String = s"$name what the heck?!"

    def unary_+ : Person = new Person(name, favoriateMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriateMovie ."

    def apply(n: Int): String = s"$name watched $favoriateMovie $n times."

    def learns(thing: String) = s"$name is learning $thing."

    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // Equivalent to above code
  // Infix notation = operator notation (Syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Interstellar")
  println(mary + tom)

  // ALL OPERATORS ARE METHODS.
  // Akka actors have ! ?

  // Prefix notation
  val x = -1 // Equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) // equivalent



  /*
  Exercises
  1. Overload the + operator
    mary + "the rockstar" => new person "Mary (the rockstar)"

  2. Add an age to the Person class
    Add a unary + operator => new person with the age + 1
    +mary => mary with the age incrementer

  3. Add a "learns" method in the Person class => "Mary learns Scala"
    Add a learnsScala method, calls learns method with "Scala".
    Use it in postfix notation.

  4. Overload the apply method
    mary.apply(2) => "Mary watched inception 2 times"
  */





  println((mary + "The Rockstar").apply())


  println((+mary).age)

  println(mary.learnsScala)
  println(mary.learns("JAVA"))

  println(mary.apply(10))
  println(mary(10)) // same as above
}


