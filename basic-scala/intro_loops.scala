object HelloWorld {
   def main(args: Array[String]) {
      //println("Hello, world!")
      //https://docs.scala-lang.org/overviews/core/string-interpolation.html
      //String interpolation
      
      val name = "James"
      println(s"Hello, $name")  // Hello, James
      println(s"1 + 1 = ${1 + 1}")
      println(s"New offers starting at $$14.99")
      val person = """{"name":"James"}"""
      println(person)      
      
      
      //f interpolator
      
     val height = 1.9d
     val name1 = "James"
     println(f"$name1%s is $height%2.2f meters tall")  
     
      
      val s = "scala"
      var sum = 0
      for(i <- 0 to s.length-1){
        sum += s(i)
       // println(s"sum = $sum. ${s(i)}")
     }
     println(for (i <- 1 to 10) yield i%3  )
     println(for {i <- 1 to 10} yield i%3  )
     println(for (c <- "scala"; i <- 0 to 1) yield (c+i))
     println(for (c <- "scala"; i <- 0 to 1) yield (c+i).toChar)
     println(for (i <- 0 to 1; c <- "scala") yield (c+i).toChar)
     
    // for(i <- 1 to 3; j <- 1 to 5 if i != j) 
        //print(f"${10*i+j}%3d")

   // for(i <- 1 to 3; from = 4-i; j <- from to 3)
        //print(f"${10*i+j}%3d")
       // println(s"i = $i j = $j")

   }
}
