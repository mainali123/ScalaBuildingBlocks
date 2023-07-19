package ScalaAndFunctionalProgrammingEssentials.ObjectOriented

object Inheritance extends App {

  // Single class inheritance
  class Animal {
    val creatureType = "wild"

    def eat = println("eating")
  }

  class Cat extends Animal

  val cat = new Cat
  println(cat.eat)


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  //  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // Overriding
  /*class Dog extends Animal {
    override def eat = println("CrunchCrunch")

    override val creatureType = "Domestic"

    val dog = new Dog
    println(dog.creatureType)
  }*/
  class Dog(override val creatureType: String) extends Animal {
    override def eat = {
      println("CrunchCrunch")
    }

  }

  // type substitution (Polymorphism)
  val unknownAnimal: Animal = new Dog("K9")


  // Preventing overrides
  // 1- use final keyword
  // 2- Seal the class (use sealed keyword) = extend classes in THIS FILE, prevents extension in other files
}
