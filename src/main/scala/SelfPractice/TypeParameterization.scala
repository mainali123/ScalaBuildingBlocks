package SelfPractice

import scala.collection.immutable._

object TypeParameterization extends App {
  val q = Queue(1, 2, 3)
  val q1 = q.enqueue(4)
  println(q)
  println(q1)

}
