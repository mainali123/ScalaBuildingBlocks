/*
त्वमेव माता च पिता त्वमेव ।
त्वमेव बन्धुश्च सखा त्वमेव ।
त्वमेव विद्या द्रविणम् त्वमेव ।
त्वमेव सर्वम् मम देव देव ॥
*/
package ScalaInDepth.FunctionClassesObjects


object ClassesObjects {
  def main(args: Array[String]): Unit = {

    val tesla = new Car()
    //    println(tesla.cost(500))

    val calculator = new Calculator(2, 3)
    println(calculator.add)
  }
}

class Car {
  var topClassExtraCost = 0
  var roadTax = 100

  def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax

}

class Calculator(val a: Double, val b: Double) {
  val test1 = 0

  def add = a + b

  def subtract = a - b

  def multiply = a * b

  def divide = a / b
}

