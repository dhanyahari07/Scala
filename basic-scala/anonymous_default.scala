object Demo{
    object Math{
        def add(x:Int=45,y:Int=15):Int={
            return x+y
        }
         
        def square(x:Int) = x*x
    }

    def print(x:Int,y:Int):Unit ={
        println(x+y)
    }

      def +(x:Int,y:Int):Int={ //not operator oberloading this is valid
            return x+y
        }

    def main(args: Array[String]){

        val sum = 10+20;

        println(Math.add());
        println(Math.add(60));
        println(Math square 3);

        var add=(x: Int, y:Int)=>x+y  //anonymous function
        println(add(200,100))
    }
}