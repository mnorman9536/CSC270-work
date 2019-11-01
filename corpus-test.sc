import scala.io.Source
import edu.holycross.shot.cite._
import edu.holycross.shot.scm._
import edu.holycross.shot.ohco2._
import java.io._
import scala.annotation.tailrec

:load utilities.sc

println("\n\n\n\n")

/* Test:
		Edit this script, replacing 'xxxx' with something else,
		so the script runs and gives good data.

		Submit your work by committing a new version of this script
		to GitHub! (That is part of the assignment.)
*/


// Test thing…
val lib: CiteLibrary = loadLibrary("text/lesMiserables_joint.cex")

val tr: TextRepository = lib.textRepository.get

val corp: Corpus = tr.corpus

// Test things…
val nodes: Vector[CitableNode] = corp.nodes

val howManyNodes: Int = nodes.length //nodes.size also works to get the length

val corpusUrns: Vector[CtsUrn] = corp.urns

val firstNode: CitableNode = nodes(0) //corps.first and nodes.head will also return the first item

val firstNodeUrn: CtsUrn = corpusUrns(0)

val firstNodeText: String = firstNode.toString()
