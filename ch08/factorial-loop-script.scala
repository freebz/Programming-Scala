// factorial-loop-script.scala

def factorial_loop(i: BigInt): BigInt = {
  var result = BigInt(1)
  for (j <- 2 to i.intValue)
    result *= j
  result
}

for (i <- 1 to 10)
  print("%s: %s\n".format(i, factorial_loop(i)))

