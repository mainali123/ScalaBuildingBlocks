package ScalaInDepth.Traits_ValueClass_UniversalTraits

trait Car {
  def engine = println("Engine is 1000 cc")
  def break: Unit
  def tyres: Unit
}

class Mercedes extends Car {
  override def break: Unit = println("Disk Breaks")

  override def tyres: Unit = println("4 Tyres")
}

object DemoATraits {
  def main(args: Array[String]): Unit = {
    val m1 = Mercedes()
    m1.break
    m1.tyres
    m1.engine
  }
}
