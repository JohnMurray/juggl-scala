package juggl

import _root_.scala.io.Source
import java.io.File

package object scala {

  def maybeReturnInt(): Option[Int] = {
    val rand = new _root_.scala.util.Random().nextInt(100)
    if (rand < 50) Some(rand)
    else None
  }

  def e(num: Int): Unit = {
    val f = new File(s"src/main/scala/juggl/scala/e$num.scala")
    println(Source.fromFile(f).getLines.mkString("\n"))
  }

  def welcome {
    println("Intro to Scala\n")
    println("https://github.com/JohnMurray/juggl-scala.git\n")
    println("John Murray")
    println("\tEnginner @ AppNexus (we serve ads)")
    println("\t@johnmurray_io")
    println("\tjohnmurray.io")
  }

}
