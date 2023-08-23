/*
त्वमेव माता च पिता त्वमेव ।
त्वमेव बन्धुश्च सखा त्वमेव ।
त्वमेव विद्या द्रविणम् त्वमेव ।
त्वमेव सर्वम् मम देव देव ॥
*/
package ScalaInDepth.Constructors

object constructorDemo1 extends App {
  val demoClass = new DemoClass1(1, 2.0, "Hello")

  val result = demoClass.addNumber
  println(s"Result: $result")
}

// Parameterized constructor (Primary Constructor)
class DemoClass1(val a: Int, val b: Double, val c: String ){
  val x = a
  val y = b
  val z = c

  def addNumber = x + y

  println(s"x = $x & y= $y & z = $z")
}
