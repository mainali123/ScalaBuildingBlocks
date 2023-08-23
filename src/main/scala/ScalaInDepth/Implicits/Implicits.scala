package ScalaInDepth.Implicits

object Implicits extends App {

  val strr = "Hello World"
  println(strr.toUpperCase())

  println(strr.firstChar)

}

implicit class StringFunctionClass(s: String) {
  def firstChar = s.substring(0, 1)
}