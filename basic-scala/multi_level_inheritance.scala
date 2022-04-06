// Base class
class Parent
{
    var Name: String = "Soniya"
}
  
// Derived from parent class
// Base class for Child2 class
class Child1 extends Parent
{
    var Age: Int = 32
}
  
// Derived from Child1 class
class Child2 extends Child1
{
    // Method
    def details(){
    println("Name: " +Name);
    println("Age: " +Age);
    }
}
  
object Main
{
      
    // Drived Code
    def main(args: Array[String]) 
    {
          
        // Creating object of the derived class
        val ob = new Child2();
        ob.details();
    }
}