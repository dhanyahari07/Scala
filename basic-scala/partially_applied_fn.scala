import java.util.Date;
object HelloWorld {
    
   def log(date:Date,message:String)={
       println(date + " "+message)
       
   }
   def main(args: Array[String]) {
      println("Hello, world!")
      val sum =(a:Int,b:Int,c:Int)=>a+b+c
      println(sum(10,20,30))
      
      val f=sum(10,20,_:Int)
      println(f(30))
      
       val f1=sum(10,_:Int,_:Int)
      println(f1(20,30))
      
      val date=new Date
      val newlog=log(date,_:String)
      newlog("message 1")
      newlog("message 2")
      newlog("message 3")
      newlog("message 4")
   }
}
