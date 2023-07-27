package ProgrammingInScala.BuiltInControlStructures

object VariableScope extends App{
  def printMultiTable() = {
    var i = 1
    // Only i in this scope
    while i <= 1 do
      var j = 1
      // Both i and j in scope here
      while j <= 10 do
        val prod = (i * j).toString
        // i, j & prod in scope here
        var k = prod.length
        // i, j, prod & k in scope here
        while k < 4 do
          print(" ")
          k += 1
        print(prod)
        j += 1
        // i, j still in scope; prod and k out of scope
      println()
      i += 1
      // i still in scope; j, prod, and k out of scope
  }

  /*val a = 0
  val a = 1 // won't compile*/

  val a = 0
  if a == 0 then
    val a = 1 // Compiles just fine
    println(a)  // variable inside if scope
  println(a)  // variable outside scope

}
