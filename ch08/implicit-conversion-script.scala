// implicit-conversion-script.scala

//import scala.runtime.RichString
import scala.collection.immutable.StringOps

class FancyString(val str: String)

object FancyString2RichString {
  implicit def fancyString2RichString(fs: FancyString) =
    //new RichString(fs.str)
    new StringOps(fs.str)
}

import FancyString2RichString._

val fs = new FancyString("scala")
println(fs.capitalize.reverse)
