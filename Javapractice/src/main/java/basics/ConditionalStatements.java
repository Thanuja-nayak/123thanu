package basics;

public class ConditionalStatements {

	public static void main(String[] args) {
	/*	int age =18;
		if(age>18) {
			System.out.println("adult");
		}else if(age>12) {
			System.out.println("teenager");
		}else {
			System.out.println("child");
		}
*/
		int a,b,c;
		a=90;
		b=70;
		c=75;
		if(a>b) {
			//System.out.println("a is greater");
			if(a>c) {
				System.out.println("a is larger="+a);
			}else {
				System.out.println("c is larger");
			}
		}else if(b>c) {
			System.out.println("b is larger");
		}else {
			System.out.println("c is larger");
		}
	}

}

		