
object HelloWorld {
   def main(args: Array[String]) {
      println("Hello, world!")
      
      // Empty hash table whose keys are strings and values are integers:
      var A:Map[Char,Int] = Map()

      // A map with keys and values.
      val colors10 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
      
     val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

      val nums: Map[Int, Int] = Map()

      println( "Keys in colors : " + colors.keys )
      println( "Values in colors : " + colors.values )
      println( "Check if colors is empty : " + colors.isEmpty )
      println( "Check if nums is empty : " + nums.isEmpty )
      
      
      val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
      val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")

      // use two or more Maps with ++ as operator
      var colors3 = colors1 ++ colors2
      println( "colors1 ++ colors2 : " + colors3 )

      // use two maps with ++ as method
      var colors4= colors1.++(colors2)
      println( "colors1.++(colors2)) : " + colors4 )
      
      
     var colors5 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

      if( colors5.contains( "red" )) {
         println("Red key exists with value :"  + colors5("red"))
      } else {
           println("Red key does not exist")
      }
      
      if( colors5.contains( "maroon" )) {
         println("Maroon key exists with value :"  + colors5("maroon"))
      } else {
         println("Maroon key does not exist")
      }
   
      
      
    
   }
}
