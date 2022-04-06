// Scala program to illustrate how to
// get the length of the given string
object Main
{
	
	// str1 and str2 are two strings
	var str1 = "Hello! GFG"
	var str2: String = "GeeksforGeeks"
	
	// Main function
	def main(args: Array[String])
	{
		
		// Get the length of str1 and str2 strings
		// using length() function
		var LEN1 = str1.length();
		var LEN2 = str2.length();
		
		// Display both strings with their length
		println("String 1:" + str1 + ", Length :" + LEN1);
		println("String 2:" + str2 + ", Length :" + LEN2);

        var Newstr = str1.concat(str2);
        println("New String :" +Newstr);
        
        var total = 130
        println("%s, %s, %d".format(str1, str2, total));
	}
}
