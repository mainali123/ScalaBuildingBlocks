package ScalaInDepth.Arrays

import collection.mutable.ArrayBuffer

object DemoDArray {
  def main(args: Array[String]): Unit = {
    val marks = ArrayBuffer[Int]()
    marks += 10
    marks += 5

    marks.foreach(println)

    marks.append(7)

    marks ++= Array(1, 2, 3, 4) // Adding values of array

    marks -= 5

  }
}
