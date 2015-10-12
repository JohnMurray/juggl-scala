package juggl.scala

import scala.util._

object E18 {

  case class DbUser(name: String, age: Int, activeUser: Boolean)

  def getNameFromDb: Try[String] = Try { "Sue" }
  def getAgeFromDb(name: String): Tri[Int] = Try { 32 }
  def getActiveStatus(name: String): Tri[Boolean] = Try { true }

  // map
  // flatMap

}
