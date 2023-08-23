/*
त्वमेव माता च पिता त्वमेव ।
त्वमेव बन्धुश्च सखा त्वमेव ।
त्वमेव विद्या द्रविणम् त्वमेव ।
त्वमेव सर्वम् मम देव देव ॥
*/
package ScalaInDepth.Constructors

object ConstructorDemo3 extends App {
  val demoClass = new DemoClass3(5, 88.88, "HEllO SCALA")
  val demoClass2 = new DemoClass3()
  val demoClass3 = new DemoClass3(5)

  val result = demoClass.addNumber
  println(s"Result: $result")
}

// Auxiliary Constructors
class DemoClass3(val a: Int, val b: Double, val c: String) {
  val x = a
  val y = b
  val z = c

  println(s"Primary constructor: x = $x & y= $y & z = $z")

  def addNumber = x + y

  // Auxiliary Construction definition
  def this() = {
    this(99, 88.88, "Hello Scala")
    println("I came into auxiliary constructor with 0 parameter")
  }

  def this(a: Int) = {
    this(a, 88.88, "Hello Scala")
    println("I came into second auxiliary constructor with 1 parameter")
  }
}
