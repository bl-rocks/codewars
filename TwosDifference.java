package code.laws; 
import java.util.*;

public class TwosDifference {
	/* This class will expose twosDifference.  A function that
	 * The objective is to return all pairs of integers from a given array of integers that have a difference of 2.
     * The result array should be sorted in ascending order of values.
	 * Assume there are no duplicate integers in the array. The order of the integers in the input array should not matter.
	 * Example: [1, 2, 3, 4]  should return [[1, 3], [2, 4]]
     * [4, 1, 2, 3]  should also return [[1, 3], [2, 4]]
	 * [1, 23, 3, 4, 7] should return [[1, 3]]
	 * [4, 3, 1, 5, 6] should return [[1, 3], [3, 5], [4, 6]]
	 */     
	  public static int[][] twosDifference(int[] intArray) { 
		  ArrayList<ArrayList<Integer>> arrLs = new ArrayList<ArrayList<Integer>>();
		  ArrayList<Integer> intAl = new ArrayList<Integer>();
		  int i, n, counter = 0;
		  
		  for(Integer num: intArray) //values into ArrayList so we can sort easily
			  intAl.add(num);
		  
		  Collections.sort(intAl);
		  
		 for(i = 0; i < intAl.size(); i++) { //loop through **SORTED** list	
			for(n = i+1; n < intAl.size(); n++) { 
				if(intAl.get(n) - intAl.get(i)  == 2) {  //check to see if we have diff of 2
					//add to 2d list 
					arrLs.add(counter, new ArrayList<>(Arrays.asList(intAl.get(i), intAl.get(n))));
					counter++;
				}
			 }	
		  } 
		 //we have 2s difference arraylist... 
		 //ie: each row of 2d list contains 2 values who's diff is 2.  Ex: [x,y]  where y-x =2
		 //so now convert back to array
		  int[][] outArray = new int[arrLs.size()][2];	 

		  for(i = 0; i < arrLs.size(); i++) {
			  // populate 2d array
			  outArray[i][0] = arrLs.get(i).get(0);
			  outArray[i][1] = arrLs.get(i).get(1);
		  }

		 return outArray;		   
	  }
}
