object HelloWorld {
    
    def math(x:Double,y:Double,f:(Double,Double)=>Double):Double = f(x,y)
    
    
    def math1(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double = f(f(x,y),z)
    
    def funEx(a:Int,f:Int=>AnyVal):Unit={
        println(f(a))
    }
    
    def multby2(a:Int):Int={
        a*2    
    }
    
    def main(args: Array[String]) {
      println("Hello, world!")
      val result=math(10,20,(x,y)=>x min y)
      println(result)
      
      val result1=math1(10,20,30,(x,y)=>x + y)
      println(result1)
      
      val result2=math1(10,20,30,_ + _)
      println(result2)
      
      funEx(25,multby2)
      
      
   }
}
