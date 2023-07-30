package ProgrammingInScala.FunctionsAndClosures

object FirstClassFunction extends App {
//  val increase = (x: Int) => x + 1  // One line first class function
  val increase = (x: Int) =>  // Multiline first class function
    val increment = 2
    x + increment

  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  someNumbers.foreach((x: Int) => println(x)) // Using foreach
  someNumbers.filter((x: Int) => x > 0) // Using filter
}
