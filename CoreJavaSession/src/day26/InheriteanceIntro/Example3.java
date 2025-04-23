package day26.InheriteanceIntro;

class Sample100 {
	Sample100() {
		System.out.println("I am zero-param cons of Sample100 class");
	}

	int num1 = 25;
	static int num2 = 50;
}

/*
 * Parent/Super/Base class: Sample10 Child/sub/inherited class: Sample20
 */
class Sample200 extends Sample100 {
	Sample200() {
		// super();
		System.out.println("I am zero-param cons of Sample200 class");
	}

	int num3 = 40;
	static int num2 = 101;
}

public class Example3 extends Sample200 {
	Example3() {
		super();// either you can write or java compiler will write it on behalf of you
		System.out.println("I am zero-param cons of Example3 class");
	}

	int num4 = 75;
	static int num2 = 201;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("static variable of Sample100, num2: " + Sample10.num2);
		System.out.println("static variable of Sample200, num2: " + Sample20.num2);
		System.out.println("static variable of Example3, num2: " + Example3.num2);

		Example3 ref = new Example3();
		System.out.println("nonstatic variable of Sample100 class, num1: " + ref.num1);
		System.out.println("nonstatic variable of Sample200 class, num1: " + ref.num3);
		System.out.println("nonstatic variable of Example3 class, num1: " + ref.num4);
		System.out.println("Program Ends");
	}
}
/*
 * /** using inheritance we can inherit non-static member parent class to child
 * 
 * to represent inheritance we need to use "extends" keyword between child and
 * parent
 * 
 * parent class---> super class | base class child class ---> sub class |
 * derived class
 * 
 * in order to achieve inheritance we need constructor chaining-
 * 
 * constructor chaining- when subclass constructor calls super class constructor
 * and super class constructor calls its super class constructor dn its known as
 * constructor chaining
 * 
 * to achieve constructor chaining we need to user super().
 * 
 * super(): its represent instance of parent class it is used to call immediate
 * parent class constructor based on parameter it should be the 1st statement
 * inside the constructor body super() and this() cann't be used together in a
 * single constructor
 */
