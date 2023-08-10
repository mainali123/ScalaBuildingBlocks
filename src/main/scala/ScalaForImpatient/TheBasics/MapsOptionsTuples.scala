package ScalaForImpatient.TheBasics

object MapsOptionsTuples extends App{
  /*val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

  // Blank Map
  val blankMap = scala.collection.mutable.Map[String, Int]()

  // Another way to define map
  val maps = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))

  if scores.contains("Bob") then scores("Bob") else 0
  // or
  scores.getOrElse("Bob", 0)

  scores.get("Bob") // Returns an object that is either Some(value of key) or None

  val score2 = scores.withDefaultValue(0)
  score2("Zendeya") // Yields 0 since Zendeya is not present*/

/*
  val scores = collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)  // Creating mutable map
  scores("Alice") = 20  // Updating values
  scores("Bob") = 6
  scores("Cindy") = 16

  scores++= Map("Bob" -> 10, "Fred" -> 7) // updates the value of Bob to 10 and adds Alice to map

  scores-="Alice" // Removes the key from the map

  val someScores = Map("Alice" -> 9, "Bob" -> 8)
  val moreScores = someScores + ("Fred" -> 10)  // New immutable map  Map(Alice -> 9, Bob -> 8, Fred -> 10)
*/

/*  val scores = Map("Alic" -> 10, "Bob" -> 7, "Fred" -> 8, "Cindy" -> 7)
  scores.keySet // Yields a set with elements "Alice", "Bob", "Fred", and "Cindy"
  for v <- scores.values do println(v)  // // Prints 10 7 8 7*/
/*  val scores = Map("Alic" -> 10, "Bob" -> 7, "Fred" -> 8, "Cindy" -> 7)
   for (i, j) <- scores yield (j, i)
   println(scores)*/

/*  val scores = collection.mutable.SortedMap("Alic" -> 10, "Bob" -> 7, "Fred" -> 8, "Cindy" -> 7)
  println(scores) // TreeMap(Alic -> 10, Bob -> 7, Cindy -> 7, Fred -> 8)*/

  val scores = Map("Alice" -> 10, "Bob" -> 7, "Fred" -> 8, "Cindy" -> 7)
  val alicesScore = scores.get("Alice") // Some(10)
  val dansScore = scores.get("Dans")  // None


}
