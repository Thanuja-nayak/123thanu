package oops;

public class OopsIntro {

	public static void main(String[] args) {
		HumanBeing obj1=new HumanBeing("Thanuja", 24, "Female");
		obj1.walk();
		obj1.eat();
		System.out.println(obj1.name);
		obj1.name="qwe";
		System.out.println(obj1.name);
	}
}
class HumanBeing{
	String name;
	int age;
	String gender;
	public HumanBeing(String inputname, int inputage, String inputgender) {
		this.name=inputname;
		this.age=inputage;
		this.gender=inputgender;
		
	}
	public void walk() {
		System.out.println(this.name + " walking");
	}
	public void eat() {
		System.out.println(this.name + " eaing");
	}
}
