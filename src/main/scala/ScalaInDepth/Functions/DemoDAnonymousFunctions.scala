package ScalaInDepth.Functions

object DemoDAnonymousFunctions {
  def main(args: Array[String]): Unit = {
    val listOfNumbers = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    // Use with Map
    var squareOfNumbers = listOfNumbers.map(square)
    squareOfNumbers = listOfNumbers.map(x => x * x) // Using anonymous function
    println(squareOfNumbers)


  }

  def square(x: Int) = x * x

  val square1: Int => Int = (x: Int) => x * x // Defining with return type... Takes an input type of Int and returns Int
  
}
