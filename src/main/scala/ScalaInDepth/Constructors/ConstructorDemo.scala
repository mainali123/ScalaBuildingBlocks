/*
त्वमेव माता च पिता त्वमेव ।
त्वमेव बन्धुश्च सखा त्वमेव ।
त्वमेव विद्या द्रविणम् त्वमेव ।
त्वमेव सर्वम् मम देव देव ॥
*/

// Program no 1
package ScalaInDepth.Constructors

object ConstructorDemo extends App {
  val demoClass = new DemoClass


}

class DemoClass{
  val x = 3
  val y = 2

  def addNumber = x + y

  println(s"x = $x & y= $y")
}

