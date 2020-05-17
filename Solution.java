package code.laws;
import java.util.*;

class Solution {
	  public static String camelCase(String input) {
		//String testStr = "abVBVdkfjJkfdlLp";
		int countuc = input.split("(?=\\p{Lu})").length - 1;
		int count = 1;
		String[] arrCamelPieces = new String[countuc];
		arrCamelPieces = input.split("(?=\\p{Lu})");
		//System.out.println("count: " + countuc); 
		StringBuilder finStr = new StringBuilder();
		
		// Verify that input has at least one Capital letter
		if(countuc > 0) {
			finStr.append(arrCamelPieces[0]);
			do {
				finStr.append(" ");
				finStr.append(arrCamelPieces[count]);
				count++;
			}
			while(count <= countuc);
			
			
		}else {
			finStr.append(input);
		}
		  
	    return finStr.toString();
	  }
	}