trait Philosophical:
  def philosophize = "I am consuming memory, Therefore I exist!"

class Frog extends Philosophical:
  override def toString: String = "Red"

val frog = Frog()
frog.philosophize
frog.toString

val phil: Philosophical = frog
phil.philosophize
phil.toString