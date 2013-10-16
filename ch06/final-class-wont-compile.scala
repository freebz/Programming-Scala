// final-class-wont-compile.scala
// WON'T COMPILE.

final class Fixed {
  def doSomething = "Fixed did somthing!"
}

class Changeable1 extends Fixed   // ERROR
