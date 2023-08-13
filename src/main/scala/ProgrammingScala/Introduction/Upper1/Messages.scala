package ProgrammingScala.Introduction.Upper1


sealed trait Message

case class Draw(shape: Shape) extends Message

case class Response(message: String) extends Message

case object Exit extends Message

object Messages {
  def apply(message: Message): Message =
    message match
      case Exit => println(s"ProcessMassage: existing...")
        Exit
      case Draw(shape) => shape.draw(str => println(s"ProcessMessage: $str"))
        Response(s"ProcessMessage: $shape drawn")
      case Response(unexpected) =>
        val response = Response(s"Error: Unexpected Response: $unexpected")
        println(s"ProcessMessage: $response")
        response
}


@main def ProcessShapesDriver =
  val messages = Seq(
    Draw(Circle(Point(0.0, 0.0), 1.0)),
    Draw(Rectangle(Point(0.0, 0.0), 2, 5)),
    Response(s"Say Hello to pi: 3.14159"),
    Draw(Triangle(Point(0.0, 0.0), Point(2.0, 0.0), Point(1.0, 2.0))),
    Exit
  )

  messages.foreach { messages =>
    val response = Messages(messages)
    println(response)
  }