// specs-script.scala

"nerd finder" should {
  "identify nerds from a List" in {
    val actors = List("Rick Moranis", "James Dean", "Woody Allen")
    val finder = new NerdFinder(actors)
    finder.findNerds mustEqual List("Rick Moranis", "Woody Allen")
  }
}
