package juggl.scala

object E13 {
  import E12.User

  def printUser(user: User) = user match {
    case User(name, age) => println(s"User $name is $age years old")
    case _               =>
  }
}
