// button.scala

package objects
import ui3.Clickable

class Button(val label: String) extends Widget with Clickable {
  def click() = {
  }

  def draw() = {
  }

  override dev toString() = "(button: label="+label+", "+super.toString()+")"
}

object Button {
  def unapply(button: Button) = Some(button.label)
}
