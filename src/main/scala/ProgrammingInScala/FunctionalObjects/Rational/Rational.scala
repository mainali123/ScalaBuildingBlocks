package ProgrammingInScala.FunctionalObjects.Rational

object Rational extends App {
  val oneHalf = new Rationals(1, 2)
  val secondHalf = new Rationals(2, 3)
  val rat = oneHalf * secondHalf // oneHalf.+(secondHalf)
  println(s"${rat.numer} / ${rat.denom}")
}

class Rationals(n: Int, d: Int):
  def this(n: Int) = this(n, 1) // Auxiliary constructor

  require(d != 0)

  private val g = gcd(n.abs, d.abs) // .abs gives the absolute value of n and d
  val numer = n / g
  val denom = d / g

  override def toString: String = s"$numer / $denom"

  def +(that: Rationals): Rationals = Rationals(numer * that.denom + that.numer * denom, denom * that.denom)

  def +(n: Int): Rationals = Rationals((n * denom) + numer, denom)

  def -(that: Rationals): Rationals = Rationals(numer * that.denom - that.numer * denom, denom + that.denom)

  def -(n: Int): Rationals = Rationals(numer - (n * denom), denom)

  def *(that: Rationals): Rationals = Rationals(numer * that.numer, denom * that.denom)

  def *(n: Int): Rationals = Rationals(numer * n, denom)

  def /(that:Rationals): Rationals = Rationals(numer * that.denom, denom * that.numer)

  def /(n: Int): Rationals = Rationals(numer * n, denom)

  def lessThan(that: Rationals) = this.numer * that.denom < this.denom * that.numer

  def max(that: Rationals) = if this.lessThan(that) then that else this

  private def gcd(a: Int, b: Int): Int = if b == 0 then a else gcd(b, a % b)
