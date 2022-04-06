object HelloWorld {
   def main(args: Array[String]) {
      println("Hello, world!")
      val list3 = 10 to 20 toList;
      for(i<- 0 to (list3.length-1))
      println(list3(i))
      
      val mylist: List[String] = List("Geeks", "For", "geeks") 
      
  
        // Display the value of mylist1 
        println("List is: " + mylist)
        
        val list = List(1, 2, 3 )
        val list1 = List("A", "B", "C", "D","E")
      //apply operation to create a zip of list
      val list2 = list zip list1
      val list4=list.zip(list1)
      //print list
      println(list2) 
      println(list4) 
      
      val a = List(1,2,3,5)
      val b = List(2,5,6,7)
      val c = a.zip(b)
      println(c.map{case(x,y) => x+y})
   }
}
