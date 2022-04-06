object HelloWorld {
    //currying is the process of converting a functin=on with multiple args to a single args
    def add(x:Int,y:Int)=x+y
    def add2(x:Int)=(y:Int)=>x+y
    def add3(x:Int)(y:Int)=x+y
    def main(args: Array[String]) {
      println(add(10,20))
      println(add2(10)(20))
      val sum40=add2(40)//partial function
      println(sum40(100))
      println(add3(100)(200))
    //val sum50=add3(50) //error
      val sum501=add3(50)_
      println(sum501(400))
   }
}
