package ScalaInDepth.Arrays

object DemoAArrays {
  def main(args: Array[String]): Unit = {

    val marks = Array(58, 62, 98, 78, 25, 46, 19, 79)

    for (mark <- marks) do
      println(mark)

    var totalMarks = 0
    var averageMarks = 0

    for mark <- marks do totalMarks += mark
    averageMarks = totalMarks / marks.length

    println(s"$totalMarks, $averageMarks")
  }
}
