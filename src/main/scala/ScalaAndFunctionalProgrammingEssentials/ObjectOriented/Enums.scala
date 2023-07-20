package ScalaAndFunctionalProgrammingEssentials.ObjectOriented

object Enums {

  enum Permissions {
    case READ, WRITE, EXECUTE, NONE

    // add fields/methods
    def openDocument(): Unit = {
      if (this == READ) then println("कागाज कहोलिदै छ")
      else println("ासामबहाव")
    }
  }

  val somePermissions: Permissions = Permissions.READ

  // Constructor args
  enum PermissionsWithBits(bits: Int) {
    case READ extends PermissionsWithBits(4)  // 100
    case WRITE extends PermissionsWithBits(2) // 010
    case EXECUTE extends PermissionsWithBits(1) // 001
    case NONE extends PermissionsWithBits(0)  // 000
  }

  // Companion object for enums
  object PermissionsWithBits {
    def fromBits(bits: Int): PermissionsWithBits = PermissionsWithBits.NONE
  }


  // Standard API
  val somePermissionsOrdinal = somePermissions.ordinal
  val allPermissions = PermissionsWithBits.values // array of all possible values of the enum
  val readPermission: Permissions = Permissions.valueOf("READ") // Permissions.READ


  def main(args: Array[String]): Unit = {
    somePermissions.openDocument()
    println(somePermissionsOrdinal)
  }
}
