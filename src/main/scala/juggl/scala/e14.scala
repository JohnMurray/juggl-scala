package juggl.scala

object E14 {
  case class PartialUser(name: String, age: Option[Int])

  def printUser(user: PartialUser) = user match {
    case PartialUser(name, Some(age)) => println(s"User $name is $age years old")
    case PartialUser(name, _)         => println(s"User $name's age is not known")
  }
}
