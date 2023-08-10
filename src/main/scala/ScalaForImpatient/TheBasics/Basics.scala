package ScalaForImpatient.TheBasics

import java.net.{MalformedURLException, URL}
import scala.io.*

object Basics extends App {
  /*
    val url = URL("https://www.diwashmainali.com.np/")

    try
      process(url)
    catch
      case ex: IndexOutOfBoundsException => println(ex)
      case _: MalformedURLException => println(s"Bad URL: $url")  // use _ for variable name when not needed
  */
  //  for i <- 10 to 0 by -1 do println(i)
  /*def signum(num: Int) =
    if num > 0 then 1
    else if num < 0 then -1
    else 0*/
  /*def countdown(n: Int) = {
    for i <- n to 0 by -1 do println(i)
  }

  countdown(5)*/

  var answer: Long = 1L
  for i <- "Hello" do answer *= i.toLong
  println(answer) // 9415087488
}
