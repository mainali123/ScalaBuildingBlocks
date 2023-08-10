package ScalaForImpatient.TheBasics

import scala.collection.mutable.ArrayBuffer

object Classes extends App {
/*  val myCounter = Counter()
  myCounter.increment()
  println(myCounter.current)

  val fedder = Person()
  fedder.age_(30)
  println(fedder.age) // Prints 30

  val time = Message()
  println(time.timeStamp)*/

/*  val p1 = Person() // Primary Constructor
  val p2 = Person("Alex") // First auxiliary constructor
  val p3 = Person("Alex", 23) // Second auxiliary constructor*/

val chatter = Network()
val myFace = Network()
val fred = chatter.join("Fred")

val wilma = chatter.join("Wilma")
fred.contacts += wilma

val barney = myFace.join("Barney")  // Has type myFace.Member

}

class Counter:
  private var value = 0 // Field must be initialized else it will be trait
  def increment() = // Methods should be initialized else it will be trait
    value += 1
  def current = value

/*class Person:
  private var privateAge = 0

  def age = privateAge  // Getter
  def age_(newValue: Int) = // Setter
    if newValue > privateAge then privateAge = newValue // Can't get younger*/

class Message:
  val timeStamp = java.time.Instant.now

class Person:
  private var name = ""
  private var age = 0

  def this(name: String) =  // An auxiliary constructor
    this()  // Calls primary constructor
    this.name = name

  def this(name: String, age: Int) =  // An auxiliary constructor
    this(name)  // calls previous auxiliary constructor
    this.age = age

class Network:
  class Member(val name: String):
    val contacts = ArrayBuffer[Member]()

  private val members = ArrayBuffer[Member]()

  def join(name: String) =
    val m = Member(name)
    members += m
    m


class BankAccount:
  var balancee: Double = 0.0

  def deposit(amount: Double) = balancee += amount
  def withdraw(amount: Double) =
    if amount > balancee then "Balance is low" else balancee -= amount
  def balance = balancee