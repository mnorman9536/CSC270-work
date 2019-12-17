import scala.io.Source

// load useful scripts
:load utilities.sc

val lesMis: "texts/Les_Mis_UTF8.txt"

// condense paragraph into one line
def removeNewLineFromParagraphs(filename: String) : String ={
  //load file as a Vector of strings
  val allLines: Vector[String] = loadFile(filename)
  val cleanedLines = allLines.filter(ln => {
    if (ln.length() > 1){
      ln.filter(_ != '\n')
    }
  }

  return cleanedLines
}

val output: Vector[String] = removeNewLineFromParagraphs(lesMis)
showMe(output)
