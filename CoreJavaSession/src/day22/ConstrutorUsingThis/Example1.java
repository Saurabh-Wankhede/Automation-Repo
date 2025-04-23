package day22.ConstrutorUsingThis;

public class Example1 {
	static int num1;

	public static void main(String[] args) {

		System.out.println("Start a Program");
		System.out.println("SGV num1: " + num1);
		int num1 = 50;
		System.out.println("Local Variable: " + num1);
		System.out.println("SGV num1: " + Example1.num1);
//		Trying to asssgin local variable valur to global variable
		Example1.num1 = num1;
		System.out.println("Local Variable: " + num1);// 50
		System.out.println("Update SGV num1: " + Example1.num1);// Update value 50

		System.out.println("End a Program");
	}
}
