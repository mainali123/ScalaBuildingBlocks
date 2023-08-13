package AdvancedScalaAndFunctionalProgramming

object Polymorphism extends App{

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
  println(nth(2, list))
  println(nth(-1, list))
}

trait List[T] {
  def isEmpty: Boolean

  def head: T

  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T]{
  def isEmpty = false
}

class Nil[T] extends List[T] {
  override def isEmpty: Boolean = true
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
}


/*Exercise
* Write a function nth that takes an integer n and a list
* and selects the n'th element of the list.
* Elements are numbered from 0.
* If index is outside the range from ø up the the length of the list
* minus one, a IndexOutOfBoundsException should be thrown.*/

def nth[A](n: Int, list: List[A]): A = {
  if list.isEmpty then throw new IndexOutOfBoundsException()
  if n == 0 then list.head
  else nth(n - 1, list.tail)
}