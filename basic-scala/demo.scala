// ========================================================
// Day 3 Discussions 
// ========================================================

/* Global comment

// sum of list elements

def sum(args: Int*) = {  //Int* represents a "sequence" of Ints
    var result = 0
    for (arg <- args) result += arg
    result
}

val s = sum(1,4,9,16,25) //this is a sequence

val t = sum(1 to 5: _*) //collection has been made a sequence


def recursiveSum(args: Int*): Int = {
    if (args.length == 0) 0
    else args.head + recursiveSum(args.tail: _*)
}

// ===== Let's get functional =====
// anonymous functions, higher-order functions
(a: Int) => 2*a
(a: Int, b:Int) => a+b
(a:Int, f:Int=>Int) => f(a)

((a: Int) => 2*a)(3) //applying the first function with input 3
((a: Int, b:Int) => a+b)(1,99) //second function application
//applying third function with first function as input
((a:Int, f:Int=>Int) => f(a))(50, ((a: Int) => 2*a))

val f1 = (a: Int) => 2*a
val f2 = (a: Int, b:Int) => a+b
val f3 = (a:Int, f:Int=>Int) => f(a)

f1(3)
f2(1,99)
f3(50,f1)

// Template for function definition
// val name = <anonymous-function>

// Alternate style for function definition
val f1a: (Int=>Int) = a => 2*a
val f2a: ((Int,Int) => Int) = (a,b) => a+b
val f3a: ((Int, (Int => Int)) => Int) = (a,f) => f(a)

f1a(3)
f2a(1,99)
f3a(50,f1) 
*/

// =========================================================
// Day 2 discussions - Control Structures
// =========================================================

// While/do loops are typical - as in Java and C++

// var n = 5
// var r = 1
// while (n > 0){
//    r = r * n
//    n -= 1   // ++ and -- are not available in Scala
             // += and -= instead available
//}
//print(s"The value of r is $r and n is $n")

// for(init; check; update) is not available for Scala

// var i, r = 1
// for (i <- 1 to 10){
//    r = r * i
//    println(s"The value of i is $i and r is $r")
//}
 
// val s = "scala"
// var sum = 0
// for(i <- 1 to s.length-1){
//    sum += s(i)
//    println(s"sum = $sum. ${s(i)}")
// }

// there is no break/continue in scala
// boolean control flag or Breaks object
// shadowing variable values

// multiple generators (like nested loop)
// loop comprehension

//for(i <- 1 to 3; j <- 1 to 5 if i != j) 
//    print(f"${10*i+j}%3d")

// for(i <- 1 to 3; from = 4-i; j <- from to 3)
//    print(f"${10*i+j}%3d") 
  
// yield returns a collection

//for (i <- 1 to 10) yield i%3  // returns a vector

//returns string
// for (c <- "scala"; i <- 0 to 1) yield (c+i).toChar 
// for (i <- 0 to 1; c <- "scala") yield (c+i).toChar object HelloWorld {
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

// ----- functions ------

//def abs(x: Double) = if (x >= 0) x else -x
// the return type is inferred. However it must be explicitly
// given if the function is recursive in nature

/*
def fact(n: Int) = {
   var res = 1
   for (i <- 1 to n) res = res*i
   res
} */

// recursive function needs return type explicitly given
// How Haskell infers the return type of a recursive function?
// Hindley-Milner algorithm does the magic in Haskell
// Hindley-Milner algo for OOP langs is still a resarch problem

//def fac(n: Int): Int = if (n <= 1) 1 else n*fac(n-1)




// =========================================================
// Day 1 Discussions - Introduction
// ==========================================================
// Java, C++, C# -> evolution slowed
// Scala -> effort towards creating a better Java
// Other efforts -> Kotlin and Ceylon
// Adoption -> Netflix, Twitter, AirBnB
// Where -> Data Processing, Distributed Processing
// ScalaJs -> Client and Server side

// val - constant (immutable) and var - variable (mutable)

// val greeting: String = "Hello "
// var message: String = "World"

// Byte, Char, Short, Int, Long, Float, Double and Boolean
// These types are classes!!
// No need for wrapper types - primitive/class types conversion
// is implicit

// 1.toString()  //You do not need casts
// 99.44.toInt
// "99.44".toDouble
// 1.to(10) // 1 is converted to RichInt to method is applied to 1.

// val x: BigInt = 1234567890
// x * x * x 

// "Hello".intersect("world") 

// Applying methods - demystified
// a + b => a.+(b)

// 1.to(10) // like a.+(b)
// 1 to 10  // like a + b

// Parameterless methods

// "scalaisfun".sorted

// import scala.math._

// sqrt(2)
// pow(2,4)
// min(3,Pi)

// apply method

// val s: String = "Hello"
// s(4)
// s.apply(4)

// BigInt("1234567890")
// BigInt.apply("1234567890")

// Array(1,4,9,16)
// Array.apply(1,4,9,16)

// Printing - formatted printing like C, C++, Java, Scala too
// You have more too

// import scala.io.StdIn

// val name = readLine("Your name: ")
// print("Your age: ")
// val age = readInt()
// println(s"Hello, $name!!  Next year, you will be ${age+1}")

// Control Structures - If statement
// If statement has a value!!

// val s = if (5 > 0) 1 else -1 // returns a value
// returns Any type as If has both String and Int
// val s = if (5 > 0) "something" else -1 
// Unit type is equivalent to void
// but is printed as AnyVal
// val s = if (5 < 0) 1

// val distance = {val dx = x - x0; val dy = y-y0; sqrt(dx**2 + dy**2)} // This is a block. The value of last expression is assgned

// Assignments returns no value (like a void)
// x = y = 1 is not allowed


