package ScalaAndFunctionalProgrammingEssentials.ObjectOriented

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("Hmmmmmm")
  }

  /*
  // Behind the scenes
  class AnonymousClasses$$anon$1 extends Animal {
    override def eat: Unit = "Hmmmmm"
  }
  val funnyAnimal: Animal = new AnonymousClasses$$anon$1
  */

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
  }

  val jim = new Person("jim"){
    override def sayHi: Unit = println(s"Hi, my mane is Jim, how can I be of service?")
  }
}
