This repositiory contains sample jave programs used on codewars.com.  Each file contains 
an object with one (sometimes two) functions to complete a task required by codewars.  
To actually use one of these files / objects you must use the popular main() function of 
java.  Copy and paste the following code into a new file and save it as test.java.
IMPORTANT UPDATE:  COULDN'T GET CODE TO WORK.  GIVEN IT'S 4YRS OLD -- NO SURPRISE!!


import java.util.Arrays;

///  Wrapper for code wars examples.  Will execute this file
public class Test {
	public static void main(String[] args) {
		String output;
		Solution x = new Solution();
		output = x.camelCase("dontprovideucase");
		System.out.println(output);	
	}
}

After you created the test.java file you should go back in and modify it depending upon which function you wish to use.  For example, to use the Solution object which contains the camelCase() function use the code above.  please note all files should reside in the same directory.

Brian Laws 5/18/20
