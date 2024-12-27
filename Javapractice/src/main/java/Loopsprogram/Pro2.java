package Loopsprogram;

public class Pro2 {

	public static void main(String[] args) {
		//Square fill pattern
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		//Rhombus pattern
		for (int i=4;i>=0;i--) {
            for (int j=0;j<=5-i;j++)
                System.out.print(" ");
            for (int k=1;k<=5;k++)
                System.out.print("*");
            System.out.println();
        }
	}

	}
