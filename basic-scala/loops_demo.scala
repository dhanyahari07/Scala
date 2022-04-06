object HelloWorld {
   def main(args: Array[String]) {
       val greet =" hello world"
       var i=0
     /*  while(i<greet.length)
       {
           println(greet(i))
           i+=1
       }*/
       
      // greet.foreach(greeting => println(greeting))
       
      // greet.foreach(println)
       
      // for(greeting <- greet)
      //  println(greeting)
        
     /*  var y=0
       do{
           println(y)
           y+=1
       }while(y<10)*/
    //  for( i <- 1.to(5))
     //   print(i)
        
//    for( i <- 1.until(5))
 //       print(i)
        
  /*  for(i <- 1 to 9 ; j <- 1 to 3)
    {
        println("i="+i+"j="+j)
    }*/
    
    val lst=List(1,2,3,4,5,6,7,8,9,10)
  //  for(i <- lst)
//        println(i)
    
     for(i <- lst;if i<6)
        println(i)
    
    }
}
