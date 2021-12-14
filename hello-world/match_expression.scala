object Demo{
    def main(args: Array[String]){
        val age=180;

        age match{
            case 20 => println(age);
            case 18 => println(age);
            case 30 => println(age);
            case 40 => println(age);
            case 50 => println(age);
            case _ => println("default");
        }

        val age1="100";


        val result= age1 match{
            case "20" => println(age);
            case "18" => println(age);
            case "30" => println(age);
            case "40" => println(age);
            case "50" => println(age);
            case _ => println("default");
        }
        println("result"+result)

        val i=7;

        i match{
            case 1 | 3 | 5 | 7 =>println("odd");
            case 2 | 4 | 6 | 8 =>println("even");
        }
    }
}