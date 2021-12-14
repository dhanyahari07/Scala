object Demo{
    def main(args: Array[String]){
        val x=20;
        var res=""
        val y=30
        if(x==20){
            res="x==20"
            println("equal to 20");
        }
        else{
            println("not 20")
            res="x!=20"

        }
        println(res);

        val res2 = if(x==20) "x==20" else "x!=20"
        println(res2)

        println(if(x==20) "x==20" else "x!=20")

         if(x==20 && y==30){
            res="x==20"
        }
        else{
            println("not 20")
            res="x!=20"

        }
            

    }
}