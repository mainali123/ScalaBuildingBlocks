/*
त्वमेव माता च पिता त्वमेव ।
त्वमेव बन्धुश्च सखा त्वमेव ।
त्वमेव विद्या द्रविणम् त्वमेव ।
त्वमेव सर्वम् मम देव देव ॥
*/
package ScalaInDepth.SingletonObject_CompaigionClass_Objects_CaseClass

object CompanionDemo {  // companion Object
  var y = 2.2

  def main(args: Array[String]): Unit = {
    val objectForCompanionDemoClass = new CompanionDemo
    println(objectForCompanionDemoClass.x)

    objectForCompanionDemoClass.getvalue
  }
}

class CompanionDemo { // Companion class
  var x = 5

  def getvalue = println(s"Value of x is: $x and value of y is: ${CompanionDemo.y}")
}
