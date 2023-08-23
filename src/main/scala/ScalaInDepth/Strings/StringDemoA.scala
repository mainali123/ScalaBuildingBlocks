package ScalaInDepth.Strings

object StringDemoA {
  def main(args: Array[String]): Unit = {
    val greetings = "Hello World!"
    println(greetings)

    // Method to get length of String (Accessor Method - Any method (Eg length()) used to get information of an object (EG: greeting) is called Accessor Method)
    val lengthOfString = greetings.length
    println("Length of string is: " + lengthOfString)

    // Concat method
    val var1 = "Hello "
    val var2 = "Scala"
    println(var1 + var2 + "!")  // You can concat using + operator/method
    println(var1.concat(var2))  // you can also use concat method

    println(var2.charAt(2)) // To get character at a given index

    // Equals method
    val varA = "Hello World!"
    val varB = "Hello World!"
    println(varA.equals(varB))  // Gives true, if both the Strings are having same contents else false

    println(varA == varB) // NOTE: Same as equals, But does one additional step. It first checks varA and varB are not NULL
  }
}
