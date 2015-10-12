package juggl.scala

// classes vs objects
object E15 {
  class AuthenticatedUser(val name: String, val token: String) {
    import AuthenticatedUser._

    private var _role = "none"
    def role = _role
    def role_=(r: String): Unit = {
      if (UserRoles.contains(r)) this._role = r
    }
  }

  object AuthenticatedUser {
    lazy val UserRoles = loadUserRoles()
    def loadUserRoles() = List("admin", "advertiser", "publisher")
  }
}
