object HelloWorld {
   def main(args: Array[String]) {
     val age = 20
     
     age match {
         case 20 => println(age);
         case 18 => println(age);
         case 30 => println(age);
         case 40 => println(age);
         case 50 => println(age);
         case _ => println("default")
     }
     
     val age1 = "100"
     
     age1 match {
         case "20" => println(age1);
         case "18" => println(age1);
         case "30" => println(age1);
         case "40" => println(age1);
         case "50" => println(age1);
         case _ => println("default")
     }
     
     val result =  age match {
         case 20 => age;
         case 18 => age;
         case 30 => age;
         case 40 => age;
         case 50 => age;
         case _ => println("default")
     }
     
     println("result="+result)
     
     val i=7
     i match {
         case 1|3|5|7|9 => println("odd");
         case 2|4|6|8|10 => println("even")
     }
     
   }
}