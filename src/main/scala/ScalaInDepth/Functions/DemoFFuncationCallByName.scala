package ScalaInDepth.Functions

object DemoFFuncationCallByName {
  def main(args: Array[String]): Unit = {
    /*printIncrementValue(2)*/
//    printIncrementValue(increment, 2)
//    printDecrementValue(decrement, 2)
  }

  /*def printIncrementValue(x: Int) = println(s"Addition value is ${increment(x)}")

  def increment(y: Int) =
    println(s"Value of y after incrementing is ${y + 1}")
    y + 1*/
//  def printIncrementValue(x: => Int, y: Int) = println(s"Addition value is ${x(y)}")

  def increment(y: Int) =
    println(s"Value of y after incrementing is ${y + 1}")
    y + 1

  def printDecrementValue(x: => Int) = println(s"Decreased value is $x")

  def decrement =
    val y = 3
    println(s"Value of y after decrement is ${y - 1}")
    y - 1
}
