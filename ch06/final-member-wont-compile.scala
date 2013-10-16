// final-member-wont-compile.scala
// WON'T COMPILE.

class NotFixed {
  final def fixedMethod = "fixed"
}

class Changeable2 extends NotFixed {
  override def fexedMethod = "not fixed"  // ERROR
}
