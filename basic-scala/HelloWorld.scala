object HelloWorld {
   def main(args: Array[String]) {
      val name = "mark"
      val age = 18
      println("Hello, world!")
      println(name + "is " + age + " years old")
      println(s"$name is $age years old") //s interpolation
      println(f"$name%s is $age%d years old") //f interpolation
      println(raw"hello \n world") /* string printed as such */
   }
}
