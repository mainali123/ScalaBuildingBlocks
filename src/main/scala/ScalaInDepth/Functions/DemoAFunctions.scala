package ScalaInDepth.Functions

object DemoAFunctions {
  def sum(x: Int, y: Int): Int = x + y

  def main(args: Array[String]): Unit = {
    val a = sum(2, 3)
    println(a)
  }
}
