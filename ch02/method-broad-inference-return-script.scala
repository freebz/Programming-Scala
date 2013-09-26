// method-broad-inference-return-script.scala
// ERROR: Won't compile; needs a String return type on the second "joiner".

def makeList(strings: String*) = {
  if (strings.length == 0)
    List(0)    // #1
  else
    strings.toList
}

val list: List[String] = makeList()
