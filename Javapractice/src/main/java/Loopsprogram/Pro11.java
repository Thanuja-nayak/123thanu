package Loopsprogram;

public class Pro11 {

	public static void main(String[] args) {
		//Number changing pyramid
		int n=1;
		for(int i = 1;i<=4;i++) {
	    	for(int j=i;j<5;j++) {
	    	// System.out.print(" ");
		} 
	    	for(int k =0;k<i;k++) {
	    	  System.out.print(n+" ");
	    	  n++;
	    	}
	    	System.out.println();
		}

	}

}
