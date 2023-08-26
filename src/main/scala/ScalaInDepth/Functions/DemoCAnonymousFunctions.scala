package ScalaInDepth.Functions

object DemoCAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    val listOfNumbers = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    listOfNumbers.foreach(x => if divisibleByThree(x) then println(s"$x is divisible by three"))
    listOfNumbers.foreach(x => if divisibleByThree1(x) then println(s"$x is divisible by three"))

    // use with Filter
    var divisibleByThreeOutput = listOfNumbers.filter(x => x % 3 == 0)
    divisibleByThreeOutput = listOfNumbers.filter(_ % 3 == 0) // Using shorthand notation
    println(divisibleByThreeOutput)
  }

  // Traditional way
  def divisibleByThree(x: Int) = if x % 3 == 0 then true else false

  // Anonymous Function
  val divisibleByThree1 = (x: Int) => if x % 3 == 0 then true else false


}
