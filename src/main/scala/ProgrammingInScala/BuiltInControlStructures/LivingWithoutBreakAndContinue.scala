package ProgrammingInScala.BuiltInControlStructures

object LivingWithoutBreakAndContinue extends App {

  var i = 0
  var foundIt = false
  while i < args.length && !foundIt do
    if !args(i).startsWith("-") then
      if args.endsWith(".scala") then
        foundIt = true
      else
        i = i + 1
    else
      i = i + 1
  println(i)


  // Recursive alternative to looping with vars
  def searchFrom(i: Int): Int = {
    if i >= args.length then -1
    else if args.startsWith("-") then searchFrom(i + 1)
    else if args.endsWith(".scala") then i
    else searchFrom(i + 1)
  }
  val ii = searchFrom(0)

}
