object Demo{
    def main(args: Array[String]){
        var x=0;
        while(x<10){
         //   println("x="+x);
            x+=1; // no x++

        }
        var y=0;
        do{
           // println("y="+y);
            y+=1; // no x++

        }while(y<10);
        for(i <- 1 to 5){

           // println("i="+i);

        }
        for(i <- 1.until(6)){

           // println("i="+i);

        }
        for(i <- 1.to(6)){
          //  println("i="+i);
        }

        for(i <- 1 to 9;j<- 1 to 3){
          //  println("i="+i+ "j="+j);
        }

        val lst=List(10,20,30,40,50,60,70,80,90)

        for(i<-lst){
           // println("i using lst" + i)
        }

           for(i<-lst;if i < 60){
         //   println("i using filters" + i)
        }

           val result=for{i<-lst;if i < 60} yield{

            i*i
        }
        println("result" + result)

        // for loop with multiple ranges
        for( w <- 0 to 3; z<- 8 until 10 )
        {
            println("Value of w is :" +w);
            println("Value of y is :" +z);
        }
    }
}