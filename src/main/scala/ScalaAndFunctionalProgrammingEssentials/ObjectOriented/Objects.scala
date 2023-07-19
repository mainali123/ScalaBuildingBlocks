package ScalaAndFunctionalProgrammingEssentials.ObjectOriented

object Objects {

  // SCALA DOESN'T HAVE CLASS LEVEL FUNCTIONALITY ("static")

  // Replacement of static
  object Person { // type + it's only instance
    // "static"/"class" - level functionality
    val N_Eyes = 2

    def canFly: Boolean = false

    // Factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")

  }


  class Person(val name: String) {
    // instance-level functionality
  }
  // COMPANIONS (having object and class in the same scope with the same name)

  def main(args: Array[String]): Unit = {
    println(Person.N_Eyes)
    println(Person.canFly)

    // Scala object = SINGLETON INSTANCE
    val mary = Person
    val john = Person
    println(mary == john) // true, because they point to same object since it only have one instance

    val person1 = new Person("Mary")
    val person2 = new Person("John")
    println(person1 == person2) // false, because they are different instances of the same object


    val bobie = Person(person1, person2) // Person.apply()
  }
  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit


}
