package code.laws;
import java.util.*;
/* Given a list lst and a number N, create a new list that contains each number of lst at 
 * most N times without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3], 
 * you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the 
 * result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
 */

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		ArrayList<Integer> finalNumbers = new ArrayList<Integer>();		
		int x, goodToAdd = 0;

		//iterate through array to create occurrences of nums in input
		for(x = 0; x < elements.length; x++) {
			goodToAdd = numOccurrenceInFinal(elements[x], x, elements);
			if(goodToAdd <= maxOccurrences)				
				finalNumbers.add(elements[x]);		
		}
		
		//int[] arr = finalNumbers.toArray();nt[] 
		int[] arr = finalNumbers.stream().mapToInt(i -> i).toArray(); 
		return arr;
	}
	
	public static int numOccurrenceInFinal(int numToFind, int whereInList, int[] listOfInts)
	{	//function will count occurrences of numToFind in listOfInts up to whereInList
		//ex: find the # of occurrences of THE # "3" in the list (of numbers) up until whereinList
		int first, digit = 0;
		for(first = 0; first <= listOfInts.length; first++) {
			if(numToFind == listOfInts[first])   // numToFind is found
				digit++;
			if(first == whereInList)  // no need to go further down list
				break;
		}
		return digit;				
	}
		
}

