package ScalaForImpatient.TheBasics

object Inheritance extends App {

  val name = new test1():
    namee("Hi")
}



sealed class Name:
  def namee(userName: String) = s"Hi, $userName"

class test1 extends Name:
  override def namee(userName: String): String = "hi"