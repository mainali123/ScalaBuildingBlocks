package FunctionalProgramming.Chapter3

object DefiningFunctionalDataStructure extends App {

  val ex1: List[Double] = List.Nil
  val ex2: List[Int] = List.Cons(1, List.Nil)
  val ex3: List[String] = List.Cons("a", List.Cons("b", List.Nil))
}

enum List[+A]:
  case Nil
  case Cons(head: A, tail: List[A])

object List:
  def apply[A](as: A*): List[A] =
    if as.isEmpty then Nil
    else Cons(as.head, apply(as.tail*))