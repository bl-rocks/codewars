package code.laws;
//import java.util.Math;

public class Xbonacci {
	  public double[] xbonacci(double[] signature, int n) {
		 double[] outSequence;
		 if(n !=0) {
			  int i;
			  outSequence = new double[n];
			  //before we get started with the math, let's load signature
	
			  	for(i=0; i < signature.length -1; i++) {
					  outSequence[i] = signature[i];
				  }
			  	i = signature.length;
				
			  	while (i < n ) {
				  //populate outSequence array with values
				  outSequence[i] = outSequence[i-1] + outSequence[i-2] + outSequence[i-3];
				  i++;  
				  }
		  } else {
			  outSequence = new double[0];  
		  }
		
		 return outSequence;
		  
	  }

}
