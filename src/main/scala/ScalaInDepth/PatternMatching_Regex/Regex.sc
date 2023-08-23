/*1. Import Scala.util.matching.Regex
* 2. Create an object of class Regex*/

import util.matching.Regex

val pattern = Regex("Hello")

val stringToFind = "Hello how are you? Hello Again"
pattern findFirstIn(stringToFind)
pattern findAllIn(stringToFind)
pattern findAllIn(stringToFind).mkString(",")