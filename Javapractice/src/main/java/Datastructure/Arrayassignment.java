package Datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrayassignment {

	public static void main(String[] args) {
		
		ArrayList<Integer> integerAL = new ArrayList<Integer>();
		System.out.println(integerAL);
		integerAL.add(1);
		System.out.println(integerAL);
		integerAL.add(2);
		integerAL.add(20);
		integerAL.add(32);
		integerAL.add(20);
		integerAL.add(12);
		integerAL.add(89);
		integerAL.add(20);
		integerAL.add(29);
		integerAL.add(56);
		integerAL.add(20);
		System.out.println(integerAL);
		//System.out.println("Enter the element to remove");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		integerAL.removeIf(element->element==a);
		System.out.println(integerAL);
	}

}
