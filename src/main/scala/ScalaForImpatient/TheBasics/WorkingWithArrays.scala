package ScalaForImpatient.TheBasics

import scala.collection.mutable.ArrayBuffer

object WorkingWithArrays extends App {
  /*  val strings = Array("Hello", "World") // An Array[Sting] of length 2-The type is inferred
    val moreString = Array.ofDim[String](5) // A string array with five elements, all initialized with null
    val nums = Array.ofDim[Int](10) // An array of ten integers, all initialized with zero

    strings(1) = "Diwash" // Modify or update value


    val b = ArrayBuffer[Int]()

    b += 1
    // ArrayBuffer(1)
    // Add an element at the end with +=
    b++=Array(1, 2, 3, 5, 8)
    // ArrayBuffer(1, 1, 2, 3, 5, 8)
    // We can append any collection with ++= operator
    b.dropRightInPlace(3)
    // ArrayBuffer(1, 1, 2)
    // Removes the last three elements

    b.insert(2, 6)
    // ArrayBuffer(1, 1, 6, 2)
    // Inserts value 6 at 2nd index of array
    b.insertAll(2, Array(7, 8, 9))
    // ArrayBuffer(1, 1, 7, 8, 9, 6, 2)
    // Inserts the elements from another collection at index 2
    b.remove(2)
    // ArrayBuffer(1, 1, 8, 9, 6, 2)
    // Removes the element present in index 2
    b.remove(2, 3)
    // ArrrayBuffer(1, 1, 2)
    // first parameter tells which index to delete and second parameter tells how many elements to remove

    b.toArray

    val a= Array(1, 2, 3, 4, 5)
    for i <- a do println(i)

    // OR
    for i <- 0 until a.length do println(s"$i: ${a(i)}")

    for i <- a do println(i)*/


  /*  val a = Array(2, 3, 5, 7, 11)
    val result = for i <- a yield 2 * i // New array i.e. Array(4, 6, 10, 14, 22)

    for elem <- a if elem % 2 == 0 yield elem / 2

    a.filter(_ % 2 == 0).map(_ / 2)*/

  /*val a = Array(9, 1, 6, 3, 5).sortWith(_ > _) // 9,6,5,3,1
  for i <- a do print(i)*/
  val matrix = Array.ofDim[Double](3, 4)  // 3Rows, 4 Columns

  val triangle = Array.ofDim[Array[Int]](10)
  for i<-triangle.indices do
    triangle(i) = Array.ofDim[Int](i + 1);
}
