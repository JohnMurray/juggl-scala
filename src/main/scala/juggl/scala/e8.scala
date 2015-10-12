package juggl.scala

object E8 {
  def maybePrintNumber(): Unit = {
    maybeReturnInt() match {
      case Some(num) => println(num)
      case None      => println("none")
    }
  }
}
