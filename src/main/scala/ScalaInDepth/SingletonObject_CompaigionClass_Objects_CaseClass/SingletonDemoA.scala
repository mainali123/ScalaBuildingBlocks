/*
त्वमेव माता च पिता त्वमेव ।
त्वमेव बन्धुश्च सखा त्वमेव ।
त्वमेव विद्या द्रविणम् त्वमेव ।
त्वमेव सर्वम् मम देव देव ॥
*/

// Program 2: Singleton
package ScalaInDepth.SingletonObject_CompaigionClass_Objects_CaseClass

object SingletonDemoA {
  def main(args: Array[String]) = {
//    val demoobjectB1 = new DemoClassB // Cannot create object from an object
    println(s"${DemoClassB.x} , ${DemoClassB.y}")
    val result = DemoClassB.addValue
    println(result)

  }
}

object DemoClassB {
  val x = 2
  val y = 5.5

  println(s"x = $x & y = $y")

  def addValue = x + y
}