package juggl.scala

object E9 {
  def maybePrintNumber(): Unit = {
    maybeReturnInt() match {
      case Some(num) => println(num)
      case None      => println("none")
    }
  }
}
