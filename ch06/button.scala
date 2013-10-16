// button.scala

package ui3

class Button(val label: String) extends Widget with Clickable {

  def click() = {
    // Logic to give the apprearance of clicking a button...
  }

  def draw() = {
    // Logic to draw the button on the display, web page, etc.
  }

  override def toString() =
    "(button: label=" + label + ", " + super.toString() + ")"
}
