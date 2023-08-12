package AdvancedScalaAndFunctionalProgramming.TasteOfAdvanceScala

import scala.util.Try

object DarkSyntaxSugar extends App {

  // Syntax Sugar #1: Methods with single parameter
  def singleArgMethod(arg: Int): String = s"$arg little number"

  val description = singleArgMethod {
    // Complex code
    27
  }

  val aTryException = Try { // java's try {...}
    throw new RuntimeException
  }

  List(1, 2, 3).map { x =>
    x + 1
  }

  // Syntax Sugar #2: Single Abstract Method
  // Instances of traits of single method can be reduced to lambdas

  trait Action {
    def act(x: Int): Int
  }

  val anInstance: Action = new Action:
    override def act(x: Int): Int = x + 1

  val aFunkyAction: Action = (x: Int) => x + 1 // Magic.... Same as above

  // Example Runnables
  val aThread = new Thread(new Runnable {
    override def run(): Unit = println("Hello, Scala")
  })

  val aSweetThread = new Thread(() => println("Sweet, Scala")) // Same as above

  // If only one method is unimplemented and other are implemented then we can use the above way

  abstract class AnAbstractType {
    def aImplementd: Int = 27

    def anUnimplemented(a: Int): Unit
  }

  val anAbstractInstance: AnAbstractType = (x: Int) => println("Hey, it works!")

  // syntax sugar #3: the :: and #:: methods which are special
  val prependedList = 1 :: List(2, 3)
  List(2, 3).::(1)

  // Scala spec: last character decides the associativity of method
  1 :: 2 :: 3 :: List(4, 5)
  List(4, 5).::(3).::(2).::(1)


  // Syntax Sugar #4: multi-word method naming

  class TeenGirls(name: String):
    def `and then said`(gossip: String) = println(s"$name said $gossip")

  val lilly = new TeenGirls("Lilly")
  lilly.`and then said`("Scala is so sweet")


  // Syntax Sugar #5: Infix Types

  class Composite[A, B]
  val composite: Composite[Int, String] = ???
  val composite1: Int Composite String = ???

  // Syntax Sugar #6: update() is very special, much like apply()

  val anArray = Array(1, 2, 3)
  anArray(2) = 7  // rewritten as anArray.update(2, 7)
  // Used in mutable collections
}
