package juggl.scala

object E7 {
  def maybePrintNumber(): Unit = {
    val maybeNumber: Option[Int] = maybeReturnInt()
    
    if (maybeNumber.isDefined) println(maybeNumber.get)
    else println("None")
  }
}
