package ScalaAndFunctionalProgrammingEssentials.AbsoluteScalaBasics

object Expressions extends App {
  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4) // Math expression
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x) // Compare expression
  // == != > >= < <=

  println(!(1 == x)) // Logical Expression
  // ! && ||

  var aVariable = 2
  aVariable += 3 // Also works with -= *= /= ...... side effects


  // Instructions (DO) VS Expressions (VALUE)

  // IF expression
  var aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)


  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE WHILE LOOP AGAIN (AVOID LOOPING AS MUCH AS YOU CAN)
  // EVERYTHING in Scala is an Expression!

  val sWeirdValue = (aVariable = 3) // Unit === void
  println(sWeirdValue)

  // SIDE-EFFECTS IN SCALA RETURNS UNIT; println(), whiles, reassigning


  // Code blocks
  val aCodeBlock = { // Value of the block is it's value of last expression
    val y = 2;
    val z = y + 1;
    if (z > 2) "Hello" else "GoodBye!"
  }
}
