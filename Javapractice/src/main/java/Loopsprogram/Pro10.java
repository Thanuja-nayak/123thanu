package Loopsprogram;

public class Pro10 {

	public static void main(String[] args) {
		//Number increasing pyramid
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//Number increasing reverse pyramid
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				//System.out.print(" ");
				System.out.print(j);
			}
			System.out.println();
		}
	}
} 
