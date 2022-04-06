import Array._
object HelloWorld {
   def main(args: Array[String]) {
      println("Hello, world!")

  var z1 = new Array[Int](3)
  
  for ( i <- 0 to (z1.length - 1)) {
        z1(i)=readInt()
      }
      
     for ( i <- 0 to (z1.length - 1)) {
        println(z1(i))
      } 
      
      
      
   }
}
