// Scala program to illustrate the
// Hierarchical inheritance

// Base class
class Parent
{
	var Name1: String = "Siya"
	var Name2: String = "Soniya"
}

// Derived from the parent class
class Child1 extends Parent
{
	var Age: Int = 32
	def details1()
	{
	println(" Name: " +Name1);
	println(" Age: " +Age);
	}
}

// Derived from Parent class
class Child2 extends Parent
{
	var Height: Int = 164
	
	// Method
	def details2()
	{
	println(" Name: " +Name2);
	println(" Height: " +Height);
	}
}

object Main
{
	
	// Driver code
	def main(args: Array[String])
	{
		
		// Creating objects of both derived classes
		val ob1 = new Child1();
		val ob2 = new Child2();
		ob1.details1();
		ob2.details2();
	}
}
