import scala.io.Source
import edu.holycross.shot.cite._
import edu.holycross.shot.scm._
import edu.holycross.shot.ohco2._
import java.io._
import scala.annotation.tailrec

:load utilities.sc

val lib: CiteLibrary = loadLibrary("texts/lesMiserables_eng.txt")
val tr: TextRepository = lib.textRepository.get
val cat: Catalog = tr.catalog
val corp: Corpus = tr.corpus

val corpText: Vector[String] = corp.nodes.map(_.text)
val cleanedCorp: Vector[String] = corpText.mkString(" ").split("[m,?!]")).toVector
showMe(cleanedCorp.filter(_.size > 0))