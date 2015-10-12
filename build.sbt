import sbt.complete.{Parsers, Parser}
import Parsers._
import scala.io.Source

name := "juggl-scala"

scalaVersion := "2.11.6"

val e = inputKey[Unit]("Print example")

e := {
  val dir = sourceDirectory.value
  val args: Seq[String] = spaceDelimited("<arg>").parsed
  val e = args.headOption.getOrElse("1")

  val f = dir / "main" / "scala" / "juggl" / "scala" / s"e$e.scala"
  val source = Source.fromFile(f).getLines.mkString("\n")
  println(source)
}
