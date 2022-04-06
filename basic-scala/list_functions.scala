object HelloWorld {
   def main(args: Array[String]) {
      println("Hello, world!")
      val nums=List(10,3,"hello")
      val x1=List(1.0,10.0)
      val y1=List(20.0,30.0)
      println("add"+(x1,y1).zipped.map(_+_))
      println("mul"+(x1,y1).zipped.map(_*_))
      
      // define two lists
    val x = List(1, 40, 10)
    val y = List(20, 25, 30)
    val z = List("DataCamp", "Tutorials", "Are", "The", "Best")

    //Head
    println();
    println("Head of list x, y, z = " + (x.head, y.head, z.head));
    println();

    //Tail
    println("Tail of list x, y, z = " + (x.tail, y.tail, z.tail));
    println();

    //isEmpty
    println("Is list x, y, z empty? = " + (x.isEmpty, y.isEmpty, z.isEmpty));
    println();

    //Concatenate
    println("Concatenating x, y, z lists with the first method = " + (x:::y:::z));
    println("Concatenating x, y, z lists with the second method = " + ((x).:::(y).:::(z)));
    println("Concatenating x, y, z lists with the third method = " + (List.concat(x,y,z)));
    println();

    //Reverse
    println("Reverse of x, y, z is = " + (x.reverse, y.reverse, z.reverse));
    println();

    //Fill
    println("Output of Fill method is = " + (List.fill(5)(z)));
    println();

    //Tabulate
    println("Output of Tabulate method is = " + (List.tabulate(5)(x => x * x * x)));

   }
}
