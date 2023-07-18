package ScalaAndFunctionalProgrammingEssentials.ObjectOriented

import java.time.LocalDate

object OOBasics extends App {

  val person = new Person("Ram", 19)
  //  println(person.greet("Diwash"))


  val writer = new Writer("Diwash", "Mainali", 2004)
  val novel = new Novel("Harry Potter", 2018, writer)

  println(novel.isWrittenBy(writer))
}

class Person(name: String, age: Int) { // Constructor

  // Class parameters are NOT fields. If we want to use it as a fields then we must add var/val before variable declaration

  def greet(name: String): Unit = println(s"${this.name} said: Hello $name")

  // Method Overloading
  def greet(): Unit = println(s"Hi, my name is $name")

  // Multiple Constructor
  def this(name: String) = this(name, 0)

  def this(name: String, age: Int, dob: LocalDate) = this(name, age)

  def this() = this("John Doe")
}

/*
Questions:
Novel and Writer class
Writer: firstName, surname, yearOfBirth
  - Method: Fullname

Novel: name, year of release, author (instance of type writer)
  - Method: authorAge (year of release), isWrittenBy (author), copy (new year of release) = new instance of Novel
*/

class Writer(firstName: String, surName: String, val yearOfBirth: Int) {
  def Fullname(): String = {
    firstName + " " + surName
  }
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge(): Int = {
    yearOfRelease - author.yearOfBirth
  }

  def isWrittenBy(author: Writer) = {
    author == this.author
  }

  def copy(newYear: Int): Novel = {
    new Novel(name, newYear, author)
  }
}

/*
Counter Class
- Receives an int value
- method: Current count
- method oto increment/decrement => return new counter
- overload inc/dec to receive an amount
*/

class Counter(count: Int) {
  def inc = new Counter(count + 1) // immutability

  def dec = new Counter(count - 1)

  def inc(n: Int) = new Counter(count + n)

  def dec(n: Int) = new Counter(count - n)
}