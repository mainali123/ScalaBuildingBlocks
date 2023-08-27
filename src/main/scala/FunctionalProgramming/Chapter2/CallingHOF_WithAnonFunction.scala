package FunctionalProgramming.Chapter2

import scala.annotation.tailrec

object CallingHOF_WithAnonFunction extends App {
  val ans = findFirstPolymorphic(Array(1, 2, 3, 4, 5), (x: Int) => x == 3)  // Anonymous Function/ Function Literal
  println(ans)

  // Exercise 2.2
  val exerciseAns = isSorted(Array(1, 2, 3, 4, 5, 1), (x: Int, y: Int) => x > y)
  println(exerciseAns)

  val res0 = isSorted(Array(1, 2, 3), _ > _)
  val res1 = isSorted(Array(1, 2, 1), _ > _)
  val res2 = isSorted(Array(3, 2, 1), _ < _)
  val res3 = isSorted(Array(1, 2, 3), _ < _)

  println(res0) // true
  println(res1) // false
  println(res2) // true
  println(res3) // false
}

def findFirstPolymorphic[A] (as: Array[A], p: A => Boolean): Int = {
  @tailrec
  def loop(n: Int): Int = {
    if n >= as.length then -1
    else if p(as(n)) then n
    else loop(n + 1)
  }
  loop(0)
}


// Exercise 2.2
def isSorted[A] (as: Array[A], gt: (A, A) => Boolean): Boolean = {
  @tailrec
  def loop(n: Int): Boolean = {
    if n > as.length - 2 then true
    else if gt(as(n), as(n + 1)) then false
    else loop(n + 1)
  }
  loop(0)
}