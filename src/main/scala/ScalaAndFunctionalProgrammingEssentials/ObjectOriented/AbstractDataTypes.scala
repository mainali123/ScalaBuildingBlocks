package ScalaAndFunctionalProgrammingEssentials.ObjectOriented

object AbstractDataTypes extends App {

  // abstract
  abstract class Animal {
    val creatureType: String

    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "K9"

    override def eat: Unit = println("Crunch Crunch")
  }

  // traits
  trait ColdBlodded
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore with ColdBlodded {
    val creatureType: String = "Croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I'm croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog;
  val croc = new Crocodile;
  croc.eat(dog)
}
