object HelloWorld{
    object Math{
        def add(x:Int, y:Int):Int={
            return x+y
        }
        
         def add1(x:Int=10, y:Int=20):Int={
            return x+y
        }
        
        
        def square(x:Int)=x*x
        
        def print1(x:Int,y:Int):Unit={
            println(x+y)
        }
        
        def **(x:Int)=x*x
        
    }
   def main(args: Array[String]) {
      //Math.print1(10,20)
      var add=(x:Int,y:Int)=>x+y
      println(add(10,80))
      println(Math.add(10,20))
      println(Math.add1())
      println(Math.square(10))
      println(Math.**(10))
   }
}
