package ProgrammingInScala.BuiltInControlStructures

object IfStatements extends App {
  val filename = if !args.isEmpty then args(0) else "default.txt"
}
