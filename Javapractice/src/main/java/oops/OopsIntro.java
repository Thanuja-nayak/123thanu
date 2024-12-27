package oops;

public class OopsIntro {

	public static void main(String[] args) {
		HumanBeing obj1=new HumanBeing("Thanuja", 24, "Female");
		String s=obj1.walk("Nayak");
		System.out.println(s);
		obj1.eat();
	}
}
class HumanBeing{
	String name;
	int age;
	String gender;
	HumanBeing(String inputname, int inputage, String inputgender) {
		name=inputname;
		age=inputage;
		gender=inputgender;
	}
	
	String walk(String name) {
		return (name +" walking");
	}
	
	void eat() {
		System.out.println(name + " eaing");
		
	}
}
