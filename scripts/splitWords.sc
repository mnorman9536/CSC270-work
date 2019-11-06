import scala.io.Source
import edu.holycross.shot.cite._
import edu.holycross.shot.scm._
import edu.holycross.shot.ohco2._
import java.io._
import scala.annotation.tailrec

:load utilities.sc

val punctuation : String = """[",.?!/ "]"""

val lib: CiteLibrary = loadLibrary("text/lesMiserables_eng.cex")
val tr: TextRepository = lib.textRepository.get
val cat: Catalog = tr.catalog
val corp: Corpus = tr.corpus

val corpText: Vector[String] = corp.nodes.map(_.text)
val cleanedCorp: Vector[String] = corpText.mkString(" ").split(punctuation).toVector
cleanedCorp.sliding(3,1).toVector


//val strippedCorp: Corpus = corp.nodes.filter( n=> {
//  n.text.replaceAll(punctuation,"").size > 0
//})
//showMe(cleanedCorp.filter(_.size > 0))
