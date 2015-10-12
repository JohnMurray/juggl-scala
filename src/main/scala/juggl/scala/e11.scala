package juggl.scala

object E11 {
  class User(val name: String, private var _age: Int) {
    def age = _age

    def age_=(newAge: Int): Unit = {
      println(s"new age: $newAge")
      _age = newAge
    }
  }
}
