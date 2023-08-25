package ScalaInDepth.Traits_ValueClass_UniversalTraits

// Whenever Car3 is extended, FourWheeler3 and Vehicle1 should also be extended
abstract class Vehicle1 {
}

trait FourWheeler3{
}

trait Car3 {
  this: FourWheeler3 with Vehicle1 => { // If you extend car3 make sure you also extend FourWheeler3 and Vehicle1
  }
}

class Mercedes3 extends Vehicle1, Car3, FourWheeler3 {
}

object DemoDTraits {
  def main(args: Array[String]): Unit = {
    val m1 = Mercedes3()
  }
}
