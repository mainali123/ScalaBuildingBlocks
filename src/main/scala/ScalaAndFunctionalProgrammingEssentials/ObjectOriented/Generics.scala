package ScalaAndFunctionalProgrammingEssentials.ObjectOriented

object Generics extends App {

  class MyList[+A] { // Generic class, also works with traits
    // use the type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
    A = Cat
    B = Dog => Animal
    */
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listofStrings = new MyList[String]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = null
  }

  val emptyListIntegers = MyList.empty[Int]

  // variance problem
  class Animal

  class Cat extends Animal

  class Dog extends Animal

  // If Cat extends Animal then will the list of class extend list of Animal? There are three possible answers to the question

  // 1. yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]

  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ???  HARD QUESTION => We return list of animals

  // 2. NO = INVARIANCE
  class InvariantList[A]

  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, no! = CONTRAVARIANCE
  class ContravariantList[-A]

  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  // bounded types

  // Upper bounded sign (<:)
  class Cage[A <: Animal](animal: A) // class cage only accepts parameter A which are subtypes of Animal

  // Lower bounded sign (>:)
  //  class Cage[A >: Animal] (animal: A) // class cage only accepts parameter A which are supertype of Animal
  val cage = new Cage(new Dog)

  class Car

  val newCage = new Cage(new Cat) // Error
}
