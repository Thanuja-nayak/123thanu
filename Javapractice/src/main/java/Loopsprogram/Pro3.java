package Loopsprogram;

public class Pro3 {

	public static void main(String[] args) { 
		//left half pattern
		for (int i= 0; i<=3; i++)  {  
		for (int j=1; j<=5-i; j++)  {  
		System.out.print(" ");  
		}  
		for (int k=0;k<=i;k++)  {  
		System.out.print("*");  
		}   
		System.out.println();  
		}  

	}

}
