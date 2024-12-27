package Assignments;

public class LeapYear {

	public static void main(String[] args) {
		int a = 2023;
		if(a%4==0 && a%100!=0 || a%400==0) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not a leap year");
		}

	}

}
