package Loopsprogram;

public class Pro6 {

	public static void main(String[] args) {
		//reverse left half pyramid
		for (int i=5; i>=0; i--)  {  
			for (int j=1; j<=5-i; j++)  {  
			System.out.print(" ");  
			}  
			for (int k=0;k<=i;k++)  {  
			System.out.print("*");  
			}   
			System.out.println("");  
			}  
	}

}