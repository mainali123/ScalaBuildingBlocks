package ProgrammingScala.Introduction.Upper1

class Upper1 {
  def convert(strings: Seq[String]): Seq[String] =
    strings.map(s => s.toUpperCase())
}

val upper1 = new Upper1
val uppers = upper1.convert(List("Hello", "Scala!"))
@main def main = println(uppers)
