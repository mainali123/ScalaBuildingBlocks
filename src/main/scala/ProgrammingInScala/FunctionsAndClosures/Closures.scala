package ProgrammingInScala.FunctionsAndClosures

object Closures extends App {
  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  var sum = 0
  someNumbers.foreach(sum += _)


  def makeIncreaser(more: Int) = (x: Int) => x + more

}
