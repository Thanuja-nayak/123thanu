package oops;

public class Myrefoops {
	
	public static void main(String[] args) {
		Animal obj1=new Animal();
		obj1.name="cat";
		obj1.size=40;
		obj1.than();
		
		Animal obj2=new Animal();
		obj2.name="Dog";
		obj2.size=10;
		obj2.than();
	
		Student stu1=new Student();
		stu1.sid=111;
		stu1.sname="Thanu";
		stu1.grade='A';
		stu1.display();
		
		Student stu2=new Student();
		stu2.sid=112;
		stu2.sname="Anu";
		stu2.grade='B';
		stu2.display();
	}
	}
class Student {
	int sid;
	String sname;
	char grade;
	
	void display() {
		System.out.println(sid+" "+sname+" "+grade);
	}
}
class Animal{
	String name;
	int size;
	
	void than() {
		System.out.println(name);
		System.out.println(size);
	}
}
	
	