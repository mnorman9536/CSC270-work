import scala.io.Source

:load utilities.sc

//original historgram
val myLines: Vector[String] = loadFile("text/Les_Mis_UTF8.txt")
val mergedMyLines: String = myLines.mkString(" ") //merges all the strings in my Vector
val myChars: Vector[Char] =  mergedMyLines.toVector
val myBetterChars: Vector[String] = myChars.map(_.toString)
val removeSpaces: Vector[String] = myBetterChars.filter(_ != " ")
val groupedChars: Vector[(String, Vector[String])] = {
  removeSpaces.groupBy( c => c).toVector
}
val charHistoUnsorted: Vector[(String, Int)] = {
  groupedChars.map(c => {
    (c._1,c._2.size)
  })
}

val charHisto: Vector[(String, Int)] = charHistoUnsorted.sortBy(_._2).reverse

//print char histo
//for (h <- charHisto) println(s"${h._1},${h._2}") //prints characters to screen with count


//hex histogram
val cleanedChars: Vector[Char] = myChars.filter(_ != ' ')
val groupedCleanedChars: Vector[(Char, Vector[Char])] = {
  cleanedChars.groupBy( c => c).toVector
}
val charHexHisto: Vector[(String, Int)] = {
  groupedCleanedChars.map(c => {
    (c._1.toHexString,c._2.size)
  })
}

//print hex histo
//for (h <- charHexHisto.sortBy(_._2).reverse) println(s"${h._1},${h._2}") //prints characters to screen with count

//joint histogram
val longHisto: Vector[(Char, String, Int)] = {
  groupedCleanedChars.map(c => {
    (c._1,c._1.toHexString,c._2.size)
  })
}

//print joint char and hex histo
for (h <- longHisto.sortBy(_._3).reverse) println(s"${h._1},${h._2},${h._3}") //prints characters to screen with count
