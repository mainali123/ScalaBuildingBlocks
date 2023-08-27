package FunctionalProgramming.Chapter2

import scala.annotation.tailrec

object PolymorphicFunctions extends App {
  val arr = Array("Diwash", "Mainali", "Utsav", "Ram", "Shyam", "Hari", "Krishna")
  val target = "Krishna"

  def isPresent[A](arg: A): Boolean = if arg == target then true else false
  val ans =  findFirstPolymorphic(arr, isPresent)
  println(ans)

}

// Monomorphic function to find string in an array
def findFirstMonomorphic(ss: Array[String], key: String): Int = {
  @tailrec
  def loop(n: Int): Int = {
    if n >= ss.length then -1
    else if ss(n) == key then n
    else loop(n + 1)
  }
  loop(0)
}


// Polymorphic function to find string in an array
def findFirstPolymorphic[A] (as: Array[A], p: A => Boolean): Int = {
  @tailrec
  def loop(n: Int): Int = {
    if n >= as.length then -1
    else if p(as(n)) then n
    else loop(n + 1)
  }
  loop(0)
}
