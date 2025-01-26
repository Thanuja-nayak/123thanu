package Loopsprogram;

public class Pro5 {

	public static void main(String[] args) {
		//k pattern
		for(int i=3;i>=1;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		for(int i=4;i>=1;i--) {
			for(int j=0;j<=4-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
