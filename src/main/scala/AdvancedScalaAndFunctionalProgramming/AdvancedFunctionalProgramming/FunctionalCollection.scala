package AdvancedScalaAndFunctionalProgramming.AdvancedFunctionalProgramming

object FunctionalCollection {

}

trait MySet[A] extends (A => Boolean) {
  // Exercise- Implement a functional set

  def apply(element: A): Boolean = contains(element)

  def contains(elem: A): Boolean
  def +(elem: A): MySet[A]
  def ++(anotherSet: A): MySet[A]

  def map[B](f: A => B): MySet[B]
  def flatMap[B](f: A => B): MySet[B]
  def filter(predicate: A => Boolean): MySet[A]
  def foreach(f: A => Unit): Unit
}

/*class EmptySet[A] extends MySet[A]:
  override def contains(elem: A): Boolean = false
  override def +(elem: A): MySet[A] = new NonEmptySet[A](elem, this)
//  override def ++(anotherSet: A): MySet[A] = anotherSet

  override def map[B](f: A => B): MySet[B] = new EmptySet[B]
  override def flatMap[B](f: A => B): MySet[B] = new EmptySet[B]
  override def filter(predicate: A => Boolean): MySet[A] = this
  override def foreach(f: A => Unit): Unit = ()*/

class NonEmptySet[A](head: A, tail: MySet[A]) extends MySet[A]:
  override def contains(elem: A): Boolean = elem == head || tail.contains(elem)

  override def +(elem: A): MySet[A] =
    if (this.contains(elem)) then this else new NonEmptySet[A](elem, this)

  override def ++(anotherSet: A): MySet[A] = ???

  override def map[B](f: A => B): MySet[B] = ???

  override def flatMap[B](f: A => B): MySet[B] = ???

  override def filter(predicate: A => Boolean): MySet[A] = ???

  override def foreach(f: A => Unit): Unit = ???
