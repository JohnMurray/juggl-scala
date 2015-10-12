package juggl.scala

import scala.util._

object E18 {

  case class DbUser(name: String, age: Int, activeUser: Boolean)

  def getNameFromDb: Try[String] = Try { "Sue" }
  def getAgeFromDb(name: String): Try[Int] = Try { 32 }
  def getActiveStatus(name: String): Try[Boolean] = Try { true }

  // map
  // flatMap

}
