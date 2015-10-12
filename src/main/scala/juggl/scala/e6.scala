package juggl.scala

// options
object E6 {
  def maybePrintNumber(): Unit = {
    val maybeNumber: Option[Int] = maybeReturnInt()
    
    if (maybeNumber.isDefined) println(maybeNumber.get)
    else println("None")
  }
}
// go to 8
