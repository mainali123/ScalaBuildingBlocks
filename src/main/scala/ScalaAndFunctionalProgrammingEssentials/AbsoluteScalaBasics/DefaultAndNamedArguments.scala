package ScalaAndFunctionalProgrammingEssentials.AbsoluteScalaBasics

object DefaultAndNamedArguments extends App {
  def trFact(n: Int, acc: Int = 1): Int = { // Setting teh default value of acc to 1
    if (n <= 1) acc else trFact(n - 1, n * acc)
  }
  val fact10 = trFact(10, 2) // The value of acc will be overwritten
  val fact11 = trFact(11) // The default value of acc will be 1 and no need to pass the parameter for it
  val fact12 = trFact(acc = 3, n = 12); // Passing arguments with respect to names
}
