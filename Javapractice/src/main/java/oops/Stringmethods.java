package oops;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {
		
		//length()
		String s="welcome";
		System.out.println(s.length());
		//concat()
		String s1="welcome";
		String s2="to java";
		System.out.println(s1.concat(s2));
		//trim()
		s="  welcome  ";
		System.out.println(s);
		System.out.println(s.trim());
		//equals() and equalsIgnoreCase()
		s1="welcome";
		s2="welcome";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("welcome"));
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equalsIgnoreCase("Welcome"));
		//contains()
		s="welcome";
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("Wel"));
		//charAt()
		s="welcome";
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(6));
		//replace()
		s="Thanuja Nayak";
		System.out.println(s.replace('a', 'x'));
		///substring()
		s="Thanuja";
		System.out.println(s.substring(1,4));
		System.out.println(s.substring(2,5));
		//toLowerCase() and toUpperCase()
		s="Thanuja";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		//split()
		s="abc@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(Arrays.toString(a));
		System.out.println(s.replace("@", ",").replace(".", ","));
		
		
	}

}
