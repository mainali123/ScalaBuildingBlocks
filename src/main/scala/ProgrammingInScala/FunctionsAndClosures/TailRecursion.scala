package ProgrammingInScala.FunctionsAndClosures

object TailRecursion extends App {
  def boom(x: Int): Int =
    if x == 0 then throw new Exception("Boom!")
    else boom(x - 1)

  boom(10)
}
