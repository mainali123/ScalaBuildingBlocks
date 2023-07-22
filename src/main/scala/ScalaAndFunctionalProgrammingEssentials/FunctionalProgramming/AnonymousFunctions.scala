package ScalaAndFunctionalProgrammingEssentials.FunctionalProgramming

object AnonymousFunctions extends App {

  // Anonymous Functions
  /*val doubler = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 * 2
  }*/

  // Anonymous Function (LAMBDA)
  val doubler = (x: Int) => x * 2
  // val doubler: Int => Int = x => x * 2


}
