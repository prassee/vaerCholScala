package vaerchol

import scala.io.Source

/*
 * தமிழ் நிரல் 
 */
object FileReader extends App {

   val file = Source.fromFile("/Users/prasannakumar/tamil.txt", "UTF-8")
  println(file.getLines().mkString(" ").split(" ").mkString(" - "))

  /**
   * sort of suffixes ends with
   * உ
   *
   */
  val split = (letter: String) => 
    if (letter.length() > 1) letter.toArray.mkString("").map { x => println(LetterDic.letterToCode(x.toString())) } 
    else println(letter)
    
  split("ட")
}