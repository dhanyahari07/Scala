import Array._
object HelloWorld {
   def main(args: Array[String]) {
      println("Hello, world!")
      
      var myMatrix = ofDim[Int](3,3)
      
      
      // build a matrix
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            myMatrix(i)(j) = j;
         }
      }
      
      // Print two dimensional array
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            print(" " + myMatrix(i)(j));
         }
         println();
      }
      
      
      
   val rows = 2
   val cols = 3
   val multidim = Array.ofDim[String](rows,cols)
   multidim(0)(0) = "Reena"
   multidim(0)(1) = "John"
   multidim(0)(2) = "Adam"
   multidim(1)(0) = "Michael"
   multidim(1)(1) = "Smith"
   multidim(1)(2) = "Steve"
   for {
   i <- 0 until rows
   j <- 0 until cols
 }
 println(s"($i)($j) = ${multidim(i)(j)}")
 
 
   }
}
