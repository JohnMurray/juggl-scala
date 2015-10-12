package juggl.scala

// iterating with for
object E16 {

  def for1(): Unit = {
    for (i <- Range(0, 10)) {
      println(i)
    }
  }

  def for2(): Unit = {
    for (i <- List(1, 2, 3, 4)) {
      println(i)
    }
  }
}
