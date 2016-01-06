package vc

/**
 * நிரல்
 */
import scala.io.Source

object Main extends App {

  import LetterDic._
  val data = Source.fromFile(this.getClass.getResource("/data.txt").getPath, "UTF-8")
  val split = (letter: String) => letter.toList.map(x => letterToCode(x + ""))
  val x = split(data.getLines.mkString)

  println("x is " + x)

  // split based on first found 3021 letter code  
  val parts = x.span(x => x != 3021)
  val part1 = parts._1

  // take the code for last letter 
  println("code to words " + part1.last)

  // code to letter to form result word 
  val wordAsCode = part1.map(x => codeToLetter(x))
  println(wordAsCode + " as code of words")
  println(wordAsCode.mkString)
  
  // match the last code to find if its one of vallinam,mellinam or idiyinam 
  
  // find out a mapping rule tabulating below info
  
  /**
   * code type         |mapped code type (many letters)
   * ------------------|--------------------------------
   * vallinam          |  
   * mellinam          |
   * ------------------|--------------------------------
   * ------------------|--------------------------------
   * ------------------|--------------------------------
   */
  
  /* 
   * suffix the mapped code from above step to the word obtained above 
   * this is the prelim result
   */
}
