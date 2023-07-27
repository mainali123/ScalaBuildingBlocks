package ProgrammingInScala.BuiltInControlStructures
import io.StdIn.readLine

object WhileLoops extends App {

  // GCD calculator using while loop
  def gcd(x: Long, y: Long) = {
    var a = x
    var b = y
    while a !=0 do
      val temp = a;
      a = b % a
      b = temp
    b
  }



  // Do-While loop
  while
    val line = readLine()
    println(s"Read $line")
    line != ""
  do()


  /*var lines = ""
  while (lines = readLine()) != "" do // Compilation error (Values of types Unit and String cannot be compared with == or !=)
    println(s"Read: $lines")*/
}
