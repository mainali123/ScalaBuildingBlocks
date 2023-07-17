package ScalaAndFunctionalProgrammingEssentials.AbsoluteScalaBasics

object StringOps extends App {

  val str = "Hello, I am learning Scala"

  // From JAVA
  println(str.charAt(2))  // Prints the character at index 2 in string
  println(str.substring(7, 11)) // Characters from index 7 (included) to index 11 (excluded)
  println(str.split(" ").toList)  // splits an string to an array whenever it encounters a whitespace
  println(str.startsWith("Hello"))  // Returns boolean value weather it is true or not
  println(str.replace(" ", "-"))  // replaces white space with dash
  println(str.toLowerCase())  // Converts string to lower case
  println(str.length) // Length of the String


  val aNumberString = "2"
  val aNumber = aNumberString.toInt // Converts string to integer
  println('a' +: aNumberString :+ 'z')  // Prepending and appending the character. Output => a2z
  println(str.reverse)  // Reverses a string
  println(str.take(2))  // Takes first 3 characters of the string


  // Scala-specific: String interpolators:

  // S-interpolator
  val name = "David"
  val age = 12
  val greeting = s"$name is $age years old."
  val nextGreeting = s"Hello my name is $name and I will be turning ${age + 1} years old next year."

  // F-interpolator
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute."
  println(myth)

  // Raw-interpolator
  println(raw"This is a \n newline")  // Backslash will not break the line. It will print as it is
  val escaped = "This is a \n newline"
  println(raw"$escaped")  // Line will break
}
