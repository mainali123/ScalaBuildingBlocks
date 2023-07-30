package ProgrammingInScala.FunctionsAndClosures

object ShortFormsOfFunctionLiterals extends App{
  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  someNumbers.filter((x: Int) => x > 0) // Using filter
  someNumbers.filter((x) => x > 0)  // Same as above but instead of mentioning the type, we are leaving it for compiler to figure out
  someNumbers.filter(x => x > 0)

}
