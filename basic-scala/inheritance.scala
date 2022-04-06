class Class1{
    var Name: String = "Dhanya"
} 
class Class2 extends Class1
{
    var Article_no: Int = 130
    def details()
    {
    println("Author name: " +Name);
    println("Total numbers of articles: " +Article_no);
    }
}
  
object Main 
{
    
    def main(args: Array[String]) 
    {
          
        
        val ob = new Class2();
        ob.details();
    }
}