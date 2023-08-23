/*
त्वमेव माता च पिता त्वमेव ।
त्वमेव बन्धुश्च सखा त्वमेव ।
त्वमेव विद्या द्रविणम् त्वमेव ।
त्वमेव सर्वम् मम देव देव ॥
*/

package ScalaInDepth.Constructors

object constructorDemo2 extends App {
  val demoClass = new DemoClass2()

  val result = demoClass.addNumber
  println(s"Result: $result")
}

// Default parameters in constructor (Primary constructor)
class DemoClass2(val a: Int = 99, val b: Double = 88.88, val c: String = "Hello Scala" ){
  val x = a
  val y = b
  val z = c

  def addNumber = x + y

  println(s"x = $x & y= $y & z = $z")
}
