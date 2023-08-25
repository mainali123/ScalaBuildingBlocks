package ScalaInDepth.Arrays

object DemoBArray {
  def main(args: Array[String]): Unit = {
    val marks = Array(58, 62, 98, 78, 25, 46, 19, 79)

    // foreach and map

    // FOREACH
    marks.foreach(println)

    var totalMarks = 0
    var averageMarks = 0

    // Using foreach
    marks.foreach(mark => totalMarks += mark) // Method 1
    averageMarks = totalMarks / marks.length

    marks.foreach(totalMarks += _)  // Method 2

    println(s"$totalMarks, $averageMarks")

    // foreach, you can get multiple outputs, example: marks.foreach(println) will give you multiple output
    // foreach, you can also get one final output, example: marks.foreach(mark => totalMarks += mark) will give you total marks

    // MAP ==> You will always get multiple output
    val newMarks = marks.map(mark => mark + 10) // method 1
    val newMarks1 = marks.map(_ + 10)
    newMarks1.foreach(println)

    // If you want to do same operation on each element of an array -----> Use MAP (Note: YOu can also do with foreach/for loop but it will be slow)
    // If you want to take Sum/get single output(eg: total marks), use foreach
  }
}
