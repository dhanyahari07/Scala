object HelloWorld {
    
    object Math{
        
        def  add(x:Int, y:Int):Int={
            return x+y
       
        } 
        
        def square(x:Int)=x*x
        
    }
    
    
   def  add(x:Int, y:Int):Int={
       return x+y
       
   }   
   def  subtract(x:Int, y:Int):Int={
       x-y
       
   } 
   def  multiply(x:Int, y:Int):Int=  x*y
   
   def  divide(x:Int, y:Int) =  x/y
   
   def main(args: Array[String]) {
      println(add(20,30))
      println(subtract(20,30))
      println(multiply(20,30))
      println(divide(60,30))
      println(Math.add(60,30))
      println(Math.square(60))
      println(Math square 60)
   }
}