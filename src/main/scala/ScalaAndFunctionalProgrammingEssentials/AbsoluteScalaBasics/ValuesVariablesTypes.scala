package ScalaAndFunctionalProgrammingEssentials.AbsoluteScalaBasics

object ValuesVariablesTypes extends App {

  //  val x: Int = 42 // Syntax to declare variable with specifying type
  val x = 42 // Syntax to declare variable without specifying type
  println(x)

  // VALS ARE IMMUTABLE
  // COMPILER can infer types

  val aString: String = "Hello, Scala"
  // Semicolons are supported by scala if we need to write a multiple code on same line else it is not necessary

  val aBoolean: Boolean = false // Boolean type
  val aChar: Char = 'S' // Character type
  val anInt: Int = 123 // Integer type
  val aShort: Short = 234 // Short type
  val aLong: Long = 123456789L // Long type
  val aFloat: Float = 123.234f // Float type
  val aDouble: Double = 3.14 // Double type

  // Variables in scala. It is defined by var
  var aVariable: Int = 4
  aVariable = 5 // Side effects
}
