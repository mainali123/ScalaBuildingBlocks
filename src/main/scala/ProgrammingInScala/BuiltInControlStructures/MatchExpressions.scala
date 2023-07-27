package ProgrammingInScala.BuiltInControlStructures

object MatchExpressions extends App {
  val firstArg = if !args.isEmpty then args(0) else ""
  val friend = firstArg match
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?") // _ is the wild card in scala

  println(friend)
}
