package ScalaInDepth.Functions

// Anonymous Function / Lambda Function
// Function without name and def keyword
// First Class Function... Pass the function as parameter and define function values

object DemoBAnonymousFunctions {

  def increments(x: Int): Int = x + 1 // Normal function

  val increasebyone = (x: Int) => x + 1 // Anonymous function no.1

  // Anonymous function with 0 input parameter and 0 output parameter
  def printHelloWorld() = println("Hello World!") // Normal function
  val printHelloWorld1 = () => println("Hello World!")  // Anonymous function no.2

  // Anonymous function with 2 input parameter and 1 output parameer
  def add(x: Int, y: Int) = x + y // Normal function
  val add1 = (x: Int, y:Int) => x + y // Anonymous function no.3


  def main(args: Array[String]): Unit = {
    println(s"Increment Function output is ${increments(5)}.")
    println(s"Increment Function output is ${increasebyone(5)}.")

    printHelloWorld()
    printHelloWorld1()

    println(s"Add function output is ${add(2,3)}")
    println(s"Add function output is ${add1(2, 3)}")
  }
}
