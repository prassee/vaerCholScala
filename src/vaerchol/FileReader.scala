package vaerchol

import scala.io.Source

/*
 * தமிழ் நிரல் 
 */
object FileReader extends App {
  val file = Source.fromFile("~/tamil.txt", "UTF-8")
  println(file.getLines().mkString(" ").split(" ").mkString(" - "))
}
