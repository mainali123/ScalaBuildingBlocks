package ScalaInDepth.Traits_ValueClass_UniversalTraits

trait FourWheeler{
  def tyres: Unit = {
    println("4 Tyres is present in Four Wheeler")
  }
}

trait Car1 {
  def engine = println("Engine is 1000 cc")
  def break: Unit

  def tyres: Unit = {
    println("4 Tyres is present Car")
  }
}

class Mercedes1 extends FourWheeler with Car1 {
  override def break: Unit = println("Disk Breaks")

  // Usage of the last trait that is extended i.e. Car1
  override def tyres: Unit = super.tyres  // Necessary for same function of different trait
}

object DemoBTraits {
  def main(args: Array[String]): Unit = {
    val m1 = Mercedes1()
    m1.break
    m1.engine
    m1.tyres
  }
}
