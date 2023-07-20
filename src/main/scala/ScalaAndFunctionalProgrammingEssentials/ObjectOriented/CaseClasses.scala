package ScalaAndFunctionalProgrammingEssentials.ObjectOriented

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.age)

  // 2. sensible toString
  // println(instance) = println(instance.toString) // Syntactic sugar
  print(jim.toString)

  // 3. equals and hashCode implemented Out of The Box
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  // 4. Case Classes have handy copy method
  val jim3 = jim.copy(age = 45)
  println(jim3.age)

  // 5. Case Classes have companion Objects
  val thePerson = Person
  val mary = Person("Marry", 23)

  // 6. Case classes are serializable
  // Akka

  // 7. Case Classes have extractor patterns = Case Classes can be used in PATTERN MATCHING

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }
}
