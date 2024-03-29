// factorial-recur1-script.scala

def factorial(i: BigInt): BigInt = i match {
  case _ if i == 1 => i
  case _ => i * factorial(i - 1)
}

for (i <- 1 to 10)
  print("%s: %s\n".format(i, factorial(i)))
