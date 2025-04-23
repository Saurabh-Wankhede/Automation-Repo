package day26.InheriteanceIntro;

class Sample1 {
	// default constructor
	int num1 = 25;
	static int num2 = 50;
}

class Sample2 {
	// default constructor
	int num1 = 40;
	static int num2 = 101;
}

public class Example1 {
	// default constructor
	int num1 = 75;
	static int num2 = 201;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Example1 static variable num2: " + Example1.num2);
		Example1 obj1 = new Example1();
		System.out.println("Example1 nonstatic variable num1: " + obj1.num1);

		System.out.println("Sample1 static variable num2: " + Sample1.num2);
		Sample1 obj2 = new Sample1();
		System.out.println("Sample1 nonstatic variable num1: " + obj2.num1);

		System.out.println("Sample2 static variable num2: " + Sample1.num2);
		Sample2 obj3 = new Sample2();
		System.out.println("Sample2 nonstatic variable num1: " + obj3.num1);
		System.out.println("Program Ends");
	}
}
