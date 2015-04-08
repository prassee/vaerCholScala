package vaerchol

import scala.io.Source

object FileReader extends App {
  val file = Source.fromFile("/Users/prasannakumar/tamil.txt", "UTF-8")
  println(file.getLines().mkString(" ").split(" ").mkString(" - "))
}

