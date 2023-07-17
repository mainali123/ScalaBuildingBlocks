package ScalaAndFunctionalProgrammingEssentials.AbsoluteScalaBasics

// Call By Name VS Call By Value
object CBNvsCBV extends App {

  def callByValue(x: Long): Unit = {  // First the value is computed and the computed value is sent to the function
    println(s"By value: $x");
    println(s"By value: $x");
  }

  def callByName(x: => Long): Unit = {  // Whole expression is sent to the function so that the computation will happen at every use of the function evaluation
    println(s"By name: $x");
    println(s"By name: $x");
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
