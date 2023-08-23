/*
त्वमेव माता च पिता त्वमेव ।
त्वमेव बन्धुश्च सखा त्वमेव ।
त्वमेव विद्या द्रविणम् त्वमेव ।
त्वमेव सर्वम् मम देव देव ॥
*/
package ScalaInDepth.FunctionClassesObjects

object HelloWorld {
  def main(args: Array[String]): Unit = {
//    println("Hello World")

    val result = add(2, 5)
    println(result)
  }

  def add (x: Int, y: Int) = {
    x + y
  }
}
