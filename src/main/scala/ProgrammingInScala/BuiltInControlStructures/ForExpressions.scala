package ProgrammingInScala.BuiltInControlStructures

import java.io.File

object ForExpressions extends App {

  // Iteration through collections
  val filesHere = (new File(".")).listFiles // Listing files in a directory
  for file <- filesHere do println(file)

  for i<- 1 to 5 do println(s"Iteration: $i") // 1 2 3 4 5
  for i<- 1 until 5 do println(s"Iteration: $i")  // 1 2 3 4

  val filesHeres = (new File(".")).listFiles
  for file <- filesHeres if file.getName.endsWith(".scala") do  // Combining for expression with if statement
    println(file)

}
