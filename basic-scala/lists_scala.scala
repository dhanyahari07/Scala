import Array._
object HelloWorld {
   def main(args: Array[String]) {
      println("Hello, world!")
      
      // List of Strings
     val fruit: List[String] = List("apples", "oranges", "pears")

    // List of Integers 
    val nums: List[Int] = List(1, 2, 3, 4)

    // Empty List.
    val empty: List[Nothing] = List()

    // Two dimensional list
    val dim: List[List[Int]] =
     List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
   )
   
   
   // List of Strings
val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))

// List of Integers
val nums1 = 1 :: (2 :: (3 :: (4 :: Nil)))

// Empty List.
val empty1 = Nil

// Two dimensional list
val dim1 = (1 :: (0 :: (0 :: Nil))) ::
          (0 :: (1 :: (0 :: Nil))) ::
          (0 :: (0 :: (1 :: Nil))) :: Nil
   
   val fruit2 = "apples" :: ("oranges" :: ("pears" :: Nil))
      val nums2 = Nil

      println( "Head of fruit : " + fruit.head )
      println( "Tail of fruit : " + fruit.tail )
      println( "Check if fruit is empty : " + fruit.isEmpty )
      println( "Check if nums is empty : " + nums.isEmpty )
      
      
      val fruit3 = "apples" :: ("oranges" :: ("pears" :: Nil))
      val fruit4 = "mangoes" :: ("banana" :: Nil)

      // use two or more lists with ::: operator
      var fruit5 = fruit3 ::: fruit4
      println( "fruit3 ::: fruit4 : " + fruit5 )
      
      // use two lists with Set.:::() method
      var fruit6 = fruit3.:::(fruit4)
      println( "fruit3.:::(fruit4) : " + fruit5 )

      // pass two or more lists as arguments
      var fruit7 = List.concat(fruit3, fruit4)
      println( "List.concat(fruit3, fruit4) : " + fruit7  )
      
      val fruit8 = List.fill(3)("apples") // Repeats apples three times.
      println( "fruit : " + fruit8  )

      val num8 = List.fill(10)(2)         // Repeats 2, 10 times.
      println( "num : " + num8  )
      
      
      // Creates 5 elements using the given function.
      val squares = List.tabulate(6)(n => n * n)
      println( "squares : " + squares  )

      val mul = List.tabulate( 4,5 )( _ * _ )      
      println( "mul : " + mul  )
      
      
      val fruit9 = "apples" :: ("oranges" :: ("pears" :: Nil))
      
      println( "Before reverse fruit : " + fruit9 )
      println( "After reverse fruit : " + fruit9.reverse )
   
   
   }
}
