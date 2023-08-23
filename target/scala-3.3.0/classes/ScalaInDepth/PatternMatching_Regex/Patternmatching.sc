def matchPattern(x: Int): String = x match
  case 1 => "One"
  case 2 => "Two"
  case 3 => "Three"
  case _ => "None of above"

println(matchPattern(1))
println(matchPattern(2))
println(matchPattern(4))

def matchPattern1(x: Any): Any = x match
  case 1 => "One"
  case 2 => "Two"
  case "Three" => 3
  case "Four" => 4
  case _ => "None of the above"

println(matchPattern1(1))
println(matchPattern1("Three"))
println(matchPattern1("Any"))

case class Car(name: String, cost: Int)

val mercedes = Car("Mercedes", 50000000)
val bmw = Car("BMW", 70000000)
val jaguar = Car("Jaguar", 100000000)

for (car <- List(mercedes, bmw, jaguar)) do
  car match
    case Car("Mercedes", 50000000) => println("Car is mercedes")
    case Car("BMW", 70000000) => println("Car is BMW")
    case Car(name, cost) => println(s"Car is $name & cost is $cost")


