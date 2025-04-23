package day40.Wrapper;

class Demo {
	/*
	 * To Create Singleton class refer below points: Create class constructor as
	 * private Create static private instance of current class Create static method
	 * which should returns object of current class
	 */

	private Demo() {
		System.out.println("I am demo class cons...");
	}
	static Demo d1=new Demo();
	static Demo geInstance() {
		return d1;
	}
	void calling() {
		System.out.println("I am calling from Demo Class.. ");
	}
	int age=100;
}

public class SingletonClassExample {

	public static void main(String[] args) {

//		Demo ref=new Demo();
		Demo ref=Demo.geInstance();
		System.out.println("Age : "+ref.age);
		
		ref.age=500;
		Demo ref2=Demo.geInstance();
		System.out.println("Updated age: "+ref2.age);
	}
}
