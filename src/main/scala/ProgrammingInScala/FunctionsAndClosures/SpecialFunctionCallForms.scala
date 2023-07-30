package ProgrammingInScala.FunctionsAndClosures

object SpecialFunctionCallForms extends App {
  // Repeated parameters
  def echo(args: String*) = // String* is actually Seq[String]
    for arg <- args do println(arg)
  echo("Diwash")  // Valid
  echo("Diwash", "Mainali") // Valid

  val seq = Seq("What's", "up", "doc?")
//  echo(seq) // Error
  echo(seq*)  // Valid


  // Named Arguments
  def printName(fname: String, lname: String) = println(s"$fname $lname")
  printName(lname = "Mainali", fname = "Diwash")

  // Default arguments
  def printAge(age: Int = 1) = println(age)
  printAge()  // Default parameter value will be printed
  printAge(19)
}
