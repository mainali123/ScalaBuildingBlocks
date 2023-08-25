package ScalaInDepth.Arrays

object DemoCArray {
  def main(args: Array[String]): Unit = {
    // reduce left
    val marks = Array(21.0, 25, 45, 78, 58, 54)
    val avg = marks.reduceLeft((x, y) => (x + y) / 2)

    val avg2 = marks.reduceLeft((x, y) =>
      println(s"${x} +  $y / 2 = ${(x + y) / 2.0}")
      (x + y ) / 2
    )

    val avg3 = marks.reduceLeft(_ / 2 + _ / 2)  // Shorthand notation
    val min = marks.reduceLeft(_ min _)
    val max = marks.reduceLeft(_ max _)

    println(avg)
    println(avg2)
    println(avg3)
    println(min)
    println(max)
  }
}
