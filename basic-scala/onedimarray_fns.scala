import Array._
object HelloWorld {
   def main(args: Array[String]) {
      println("Hello, world!")
     
     var myList1 = Array(1.9, 2.9, 3.4, 3.5)
     var myList2 = Array(8.9, 7.9, 0.4, 1.5)

     var myList3 =  concat( myList1, myList2)
      
      // Print all the array elements
      for ( x <- myList3 ) {
         println( x )
      }
      
      
      var myList4 = range(10, 20, 2)
      var myList5 = range(10,20)

      // Print all the array elements
      for ( x <- myList4 ) {
         print( " " + x )
      }
      
      println()
      for ( x <- myList5) {
         print( " " + x )
      }
      
   }
}
