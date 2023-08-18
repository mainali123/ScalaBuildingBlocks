package ProgrammingScala.TypelessDomore

object Range extends App{
  val oneToTen = 1 to 10  // Int range inclusive, interval 1, (1 to 10)
  val oneToTen1 = 1 until 10  // Int range exclusive, interval of 1, (1 to 9)
  val valueJump = 1 to 10 by 3  // Int range inclusive, every third.
  val valueJump1 = 1 to 10 by -3  // Int range inclusive, every third, counting down
}
