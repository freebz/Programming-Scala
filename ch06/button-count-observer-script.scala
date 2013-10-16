// button-count-observer-script.scala

val bco = new ui.ButtonCountObserver
val oldCount = bco.count
bco.count = 5
val newCount = bco.count
println(newCount + " == 5 and " + oldCount + " == 0?")
