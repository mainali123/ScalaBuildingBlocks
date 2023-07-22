package FunctionalProgramming.Chapter1

import FunctionalProgramming.Chapter1.ProgramWithSideEffect.CreditCard

object ProgramWithSideEffect extends App {

/*  class Cafe:
    def buyCoffee(cc: CreditCard): Coffee =
      val cup = Coffee()
      cc.charge(cup.price) // Side Effect
      cup

  class CreditCard:
    def charge(price: Double): Unit = // Side Effect
      println("Charging " + price)

  class Coffee:
    val price: Double = 2.0

  val cc = CreditCard()
  val cafe = Cafe()
  val cup = cafe.buyCoffee(cc)*/


//Making code more modular and testable by letting CreditCard be ignorant and passing Payments object into buyCoffee.

  class Cafe:
    def buyCoffee(cc: CreditCard, p: Payments): Coffee =
      val cup = Coffee()
      p.charge(cc, cup.price)
      cup

  class CreditCard

  trait Payments:
    def charge(cc: CreditCard, price: Double): Unit

  class SimulatedPayments extends Payments:
    def charge(cc: CreditCard, price: Double): Unit =
      println(s"charging $price to $cc")

  class Coffee:
    val price: Double = 2.0

  val cc = CreditCard()
  val p = SimulatedPayments()
  val cafe = Cafe()
  val cup = cafe.buyCoffee(cc, p)
}
