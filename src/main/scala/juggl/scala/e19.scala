package juggl.scala

object E19 {
  import E18._

  val user = for {
    name   <- getNameFromDb
    age    <- getAgeFromDb(name)
    active <- getActiveStatus(name)
  } yield DbUser(name, age, active)

}
