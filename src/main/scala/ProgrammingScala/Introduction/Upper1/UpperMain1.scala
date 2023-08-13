package ProgrammingScala.Introduction.Upper1

object UpperMain1 {
  def main(params: Array[String]): Unit =
    print("UpperMain1.main: ")
    params.map(s => s.toUpperCase()).foreach(s => print(s))
    println("")
}
