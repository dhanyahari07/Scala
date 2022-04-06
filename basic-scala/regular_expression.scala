// Creating object
import scala.util.matching.Regex
object GfG
{

	// Main method
	def main(args: Array[String])
	{
	
		// Applying r() method
		val portal = "GeeksforGeeks".r
		val CS = "GeeksforGeeks is a CS portal."

		// Displays the first match
		println(portal findFirstIn CS)

        // Applying Regex class
        val x = new Regex("Nidhi")
        val myself = "My name is Nidhi Singh."
  
        // replaces first match with the
        // String given below
        println(x replaceFirstIn(myself, "Rahul"))

        val Geeks = new Regex("(G|g)fG")
        val y = "GfG is a CS portal. I like gfG"
  
        // Displays all the matches separated
        // by a separator
        println((Geeks findAllIn y).mkString(", "))
	}
}
