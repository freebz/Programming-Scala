// button-callbacks-spec.scala

package ui
import org.specs._

object ButtonWithCallbacksSpec extends Specification {
  "A ButtonWithCallbacks" should {
    // ...
    "not be constructable with a null callback list" in {
      val nullList:List[() => Unit] = null
      val errorMessage = 
        "requirement failed: Callback list can't be null!"
      (new ButtonWithCallbacks("button1", nullList)) must throwA(
        new IllegalArgumentException(errorMessage))
    }
  }
}
