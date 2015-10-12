package juggl.scala

object E8 {

  def printNumber(num: Int): Unit = {
    num match {
      case 1 | 2      => println("one or two")
      case n if n < 1 => println("less than one")
      case n if n < 5 => println("3 or 4")
      case _          => println("5 or larger")
    }
  }

  // printNumber(1)
  // printNumber(50)
  // printNumber(-3)
}
