package Datastructure;

public class Array {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 5;
		a[2] = 5;
		a[3] = 5;
		a[4] = 5;
//		a[5] = 5; 
		
		
		int b[];
		b = new int[5];
		
		int c[] = {2, 5, 3, 4, 6};
		System.out.println(c[2]);
//		System.out.println(c[-6]); 
		double d[] = {4, 5.6, 5.898, 6, 7};
		for(int i=0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		for(double element : d) {
			System.out.println(element);
		}

	}

}
