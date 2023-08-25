package ScalaInDepth.Traits_ValueClass_UniversalTraits

// Value Class: Cannot allocate runtime object
// Value class always has ONLY 1 PARAMETER WITH TYPE AS VAL
// You cannot extend a Value Class

// VALUE CLASS CANNOT EXTEND A TRAIT. THAT'S WHY YOU HAVE A UNIVERSAL TRAIT

// Benefits of Value Class:
// 1. Less initialization
// 2. Better performance
// 3. Less Memory usage
// 4. Use Case: Performance and Memory Optimization

trait Car4 extends Any {  // UNIVERSAL TRAIT
  def print(): Unit = println(this)
}

class Mercedes4(val x: Int) extends AnyVal with Car4 { // VALUE CLASS
//  val y = 1 // Cannot define any variables in a value class. Can only define methods
  def hello(): Unit = {
    println("Hello")
  }
}

object DemoETraits {
  def main(args: Array[String]): Unit = {
    val m1 = Mercedes4(5)
    m1.print()
  }
}
