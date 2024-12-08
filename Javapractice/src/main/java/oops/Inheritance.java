package oops;

public class Inheritance {

	public static void main(String[] args) {
		GrandFather ajja =new GrandFather();
		ajja.gfmethod();
		ajja.watch();
		Father appa=new Father();
		appa.fmethod();
		appa.gfmethod();
		appa.watch();
		Child papu=new Child();
		papu.cmethod();
		papu.gfmethod();
		papu.watch();
		//papu.fmethod();
	}
}
	class GrandFather {
		public GrandFather() {
			System.out.println("This is grand father consttructor");
		}
		public void gfmethod() {
			System.out.println("This is grand father class");
		}
		public void watch() {
			System.out.println("this is grand father's watch");
		}
	 
}
	class Father extends GrandFather{
		public Father() {
			System.out.println("This is Father class constructor");
		}
		public void fmethod() {
			System.out.println("This is father class");
		}
	}
	class Child extends Father{
		public void cmethod(){
			System.out.println("This is child class");
		}
	}
