package ProgrammingScala.Introduction.Upper1

case class Point(x: Double = 0.0, y: Double = 0.0)

// Companion Object of the Point: AUTO-GENERATED when used case class
object Point:
  def apply(x: Double = 0.0, y: Double = 0.0) = new Point(x, y)

abstract class Shape():
  /**
   * Draw the shape.
   * @param f is a function to which the shape will pass a string version of itself to be rendered*/
  def draw(f: String => Unit): Unit = f(s"Draw: $this")

case class Circle(centre: Point, radius: Double) extends Shape

case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape

case class Triangle(point1: Point, pont2: Point, point3: Point) extends Shape


