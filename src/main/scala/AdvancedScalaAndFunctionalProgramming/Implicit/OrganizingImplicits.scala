package AdvancedScalaAndFunctionalProgramming.Implicit

object OrganizingImplicits extends App {

  implicit val reverseOrdering: Ordering[Int] = Ordering.fromLessThan(_ > _)
//  implicit val normalOrdering: Ordering[Int] = Ordering.fromLessThan(_ < _)
  println(List(1, 4, 5, 3, 2).sorted)

  /*
  Implicits (Used as implicit parameters):
  - val/var
  - object
  - accessor methods = defs with no parenthesis
  */

  // Exercise
  case class Person(name: String, age: Int)
}
