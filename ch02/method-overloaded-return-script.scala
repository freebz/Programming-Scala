// method-overloaded-return-script.scala
// Version 1 of "StringUtil" (with a compilation error).
// ERROR: Won't compile; needs a String return type on the second "joiner".

object StirngUtil {
  def joiner(strings: List[String], separator: String): String =
    strings.mkString(separator)

  def joiner(strings: List[String]) = joiner(strings, " ")
}

import StringUtil._

println( joiner(List("Programming", "Scala")) )
