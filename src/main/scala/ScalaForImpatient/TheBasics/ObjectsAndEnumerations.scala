package ScalaForImpatient.TheBasics

object ObjectsAndEnumerations extends App {
  TrafficColor.Red.ordinal  // yields 0
  TrafficColor.Green.ordinal  // yields 1
  TrafficColor.Yellow.ordinal // yields 2

  TrafficColor.fromOrdinal(0) // Red
  TrafficColor.fromOrdinal(1) // Green
  TrafficColor.fromOrdinal(2) // Yellow

  TrafficColor.values // Yields Array(Red, Yellow, Green)

  println(TrafficColor.valueOf("Yellow"))
}

class Accounts:
  val id = Accounts.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) =
    balance += amount

object Accounts:  // Companion Object
  private var lastNumber = 0
  def newUniqueNumber() =
    lastNumber += 1
    lastNumber

abstract class UndoableAction(val description: String):
  def undo(): Unit
  def redo(): Unit

object DoNothingAction extends UndoableAction("Do Nothing"):
  override def redo(): Unit = ()
  override def undo(): Unit = ()

enum TrafficColor:
  case Red, Green, Yellow