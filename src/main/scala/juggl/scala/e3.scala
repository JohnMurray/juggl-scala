package juggl.scala

object E3 {
  var myAge: Int = 25
  val ssn: String = "123-45-6789"

  var numbers: List[Int] = List(1, 2, 3, 4)

  import scala.collection.mutable.MutableList
  val mutNumbers: MutableList[Int] = MutableList(1, 2, 3, 4)

  val emptyList: List[String] = Nil
}
