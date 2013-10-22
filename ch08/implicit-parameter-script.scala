// implicit-parameter-script.scala

//import scala.runtime.RichString
//import scala.collection.immutable.StringOps

def multiplier(i: Int)(implicit factor: Int) {
  println(i * factor)
}

implicit val factor = 2

multiplier(2)
multiplier(2)(3)
