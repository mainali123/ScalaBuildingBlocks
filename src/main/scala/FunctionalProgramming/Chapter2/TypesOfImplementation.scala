package FunctionalProgramming.Chapter2

object TypesOfImplementation extends App {

}

def partial1[A, B, C](a: A, f: (A, B) => C): B => C = { // Returns a function that takes argument of type B and return type C
  (b: B) => f(a, b)
}

// Exercise 2.3
def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
  (a: A) => (b: B) => f(a, b)
}

// Exercise 2.4
def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
  (a: A, b: B) => f(a)(b)
}

// Exercise 2.5
def compose[A, B, C](f: B => C, g: A => B): A => C = {
  (a: A) => f(g(a))
}