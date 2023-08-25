package ScalaInDepth.Traits_ValueClass_UniversalTraits

abstract class Vehicle {
  def category(): Unit
}

trait FourWheeler2{
  def tyres: Unit = {
    println("4 Tyres is present in Four Wheeler")
  }
}

trait Car2 {
  var x = 1000
  val t = 4
  def engine = println(s"Engine is $x cc in a Mercedes")
  def break: Unit

  def tyres: Unit = {
    println(s"$t Tyres is present in a Car")
  }
}

class Mercedes2 extends Vehicle, FourWheeler2, Car2 {
  x = 2000
  override val t: Int = 6 // If we want to change the value of val
  override def break: Unit = println("Disk Breaks")

  override def tyres: Unit = super.tyres

  override def category(): Unit = println("It is Mercedes ")

  override def engine: Unit = println(s"Engine of Mercedes is ${x} CC")
}

object DemoCTraits {
  def main(args: Array[String]): Unit = {
    val m1 = Mercedes2()
    m1.break
    m1.engine
    m1.tyres
    m1.category()
  }
}
