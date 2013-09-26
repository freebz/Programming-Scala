// method-nested-return-script.scala
// ERROR: Won't compile until you put a String return type on upCase.

def upCase(s: String): String = {
  if (s.length == 0)
    return s
  else
    s.toUpperCase()
}

println( upCase("") )
println( upCase("Hello") )
