package FunctionalProgramming.Chapter3

object PatternMatching extends App {

}
enum List1[+A]:
  case Nil
  case Cons(head: A, tail: List1[A])

object List1:
  def apply[A](as: A*): List1[A] =
    if as.isEmpty then Nil
    else Cons(as.head, apply(as.tail*))

  def sum(ints: List1[Int]): Int = ints match
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)

  def product(doubles: List1[Double]): Double = doubles match
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
