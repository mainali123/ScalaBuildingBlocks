package BegineersGuideToScala.ALittleScala.CheckingTheAvailableMemory

object CheckingAvailableMemory {

  def main(args: Array[String]): Unit = {
    val runtime = sys.runtime
    val freeMemory = runtime.freeMemory()
    val totalMemory = runtime.totalMemory()

    println(s"Total memory is $totalMemory and free memory is $freeMemory")
    println("Requesting system gc")
    sys.runtime.gc()

    val newFreeMemory = runtime.freeMemory()
    println(s"Total memory is $totalMemory and free memory is now $newFreeMemory")
  }
}
