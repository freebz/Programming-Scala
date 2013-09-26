// string-util-v2-v28-script.scala
// Version 2 of "StringUtil" for Scala v2.8 only.

object StringUtil {
  def joiner(strings: List[String], separator: String = " "): String =
    strings.mkString(separator)
}

import StringUtil._

println(joiner(List("Programing", "Scala")))
println(joiner(strings = List("Programing", "Scala")))
println(joiner(List("Programing", "Scala"), " "))
println(joiner(List("Programing", "Scala"), separator = " "))
println(joiner(strings = List("Programing", "Scala"), separator = " "))

println(joiner(separator = " ", strings = List("Programing", "Scala")))
