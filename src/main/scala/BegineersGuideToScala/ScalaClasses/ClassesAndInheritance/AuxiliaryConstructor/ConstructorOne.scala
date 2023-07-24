package BegineersGuideToScala.ScalaClasses.ClassesAndInheritance.AuxiliaryConstructor

object ConstructorOne extends App {


  val person = new Person("Diwash", 19, 2004)
  person.names(person.name, person.age, person.dob)
}

class Person(val name: String) {

  // we have to set the value to the new variable from the auxiliary constructor if we have more values than in primary constructor if we want to call the value from the object
  var age: Int = 0
  var dob: Int = 0
  var money1: Int = 0
  var money2: Int = 0

  def this(name: String, age: Int, dob: Int) = {
    this(name) // It is compulsory to call the primary constructor or another constructor while creating a constructor and pass the value in it
    this.age = age
    this.dob = dob
  }

  def this(money1: Int, money2: Int) = {
    this("default") // It is compulsory to call the primary constructor or another constructor while creating a constructor and pass the value in it
    this.money1 = money1
    this.money2 = money2
  }

  def names(names: String, age: Int, dob: Int): Unit = {
    println(s"name: $names, age: $age, dob: $dob")
  }

  def moneys(money1: Int, money2: Int) = {
    println(s"money1: $money1, money2: $money2")
  }
}