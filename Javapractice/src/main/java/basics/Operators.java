package basics;

public class Operators {

	public static void main(String[] args) {
		int a=573;
		int b=5;
		int c=a%b;
		System.out.println(c);
		
		a--;
		System.out.println(a);
		--a;
		System.out.println(a);
		b++;
		System.out.println(b);
		++b;
		System.out.println(b);
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println("--------------");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("------ternary------");
		a=100;
		b=50;
		c=30;
		System.out.println((a<b)?a:b);
		System.out.println((a>b)?(a>c?a:c):(b>c?b:c));
		System.out.println((a<b)?(a<c?a:c):(b<c?b:c));
		System.out.println((b>c)?(a>b?a:b):(a>c?a:c));
		System.out.println((a>c)?(a>b?a:b):(b>c?b:c));
		System.out.println((a>b)?(b>c?b:c):(a>c?a:c));
	}

}
