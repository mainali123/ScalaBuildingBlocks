package ProgrammingScala.TypelessDomore


object PartialFunction extends App {
  val pfs: PartialFunction[Matchable, String] =
    case s: String => "Yes"

  val pfd: PartialFunction[Matchable, String] =
    case d: Double => "Yes"

  val pfsd = pfs.orElse(pfd)
}
