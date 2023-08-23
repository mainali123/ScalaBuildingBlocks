/*
त्वमेव माता च पिता त्वमेव ।
त्वमेव बन्धुश्च सखा त्वमेव ।
त्वमेव विद्या द्रविणम् त्वमेव ।
त्वमेव सर्वम् मम देव देव ॥
*/
package ScalaInDepth.SingletonObject_CompaigionClass_Objects_CaseClass

case class Car (name: String, model: String) {
  val carName = name
  val carModel = model

  def printDetails() = {
    println(s"Car Name is: $carName & Car Model is: $carModel")
  }
}

object CaseClassDemoA {
  def main(args: Array[String]): Unit = {
    val tesla = Car("Tesla", "X") // 1. No need to write "new", since "apply" method is auto generated in case class
    tesla.printDetails()

//    tesla.name = "T.E.S.L.A"  // 2. Constructor parameter is val by default, therefore mutator method is not generated and hence you cannot change the name. However, if you change the constructor parameter to var, mutator method will be auto generated and you will be able to modify the value in variable

    tesla match {case Car(a, b) => println((a, b)) }  // 3. Case class autogenerated unapply method, used for pattern matching

    // 4. Autogenerates copy method
    val mercedes = tesla.copy(name = "Mercedes Benz")
    mercedes.printDetails()

    // 5. Autogenerates equals and hashcode methods
    println(tesla == mercedes)

    // 6. toString method is autoimplemented
    println(tesla)
  }
}
