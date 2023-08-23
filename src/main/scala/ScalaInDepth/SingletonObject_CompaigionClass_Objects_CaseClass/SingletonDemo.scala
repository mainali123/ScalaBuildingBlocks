/*
त्वमेव माता च पिता त्वमेव ।
त्वमेव बन्धुश्च सखा त्वमेव ।
त्वमेव विद्या द्रविणम् त्वमेव ।
त्वमेव सर्वम् मम देव देव ॥
*/

// Program 1: Revision
package ScalaInDepth.SingletonObject_CompaigionClass_Objects_CaseClass

object SingletonDemo {
  def main(args: Array[String]) = {
    println(Employee.x) // Can directly access without creating any object since it is by-default static

    val demoobjectA1 = new DemoClassA
    println(s"${demoobjectA1.x} , ${demoobjectA1.y}")
    val result = demoobjectA1.addValue
    println(result)

  }
}

object Employee {
  val x = 2
  val y = 2
  println("abc")
}


class DemoClassA {
  val x = 2
  val y = 5.5

  println(s"x = $x & y = $y")

  def addValue = x + y
}