package AdvancedScalaAndFunctionalProgramming.TasteOfAdvanceScala

object Generics{

  // GENERICS
  trait GoodList[A] {
    def head: A
    def tail: GoodList[A]
  }

  case class GoodEmpty[A]() extends GoodList[A]:
    override def head = throw new NoSuchElementException()
    override def tail = throw new NoSuchElementException()


  case class GoodNonEmpty[A](h: A, t: GoodList[A]) extends GoodList[A]:
    override def head: A = h
    override def tail: GoodList[A] = t



  val goodNumber: GoodList[Int] = GoodNonEmpty(1, GoodNonEmpty(2, GoodNonEmpty(3, GoodEmpty())))
  val firstNumber = goodNumber.head

  def main(args: Array[String]): Unit = {

  }

}
