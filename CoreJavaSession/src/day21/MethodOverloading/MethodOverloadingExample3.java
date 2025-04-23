package day21.MethodOverloading;


public class MethodOverloadingExample3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		main();
		System.out.println("Program ends");
	}
	
	static void main() {
		System.out.println("I am main without parameters");
	}
}

/*
Method Overloading:
	when a method declared more than once in a call dn that method will be known as overloaded method
	for overloading, method should have-
		1. number of parameter diff //or
		2. type of parameter diff //or
		3. position of parameter diff //or
Adv:
	we can perform same operation with diff type values or with diff logic

can we overload main()? yes

can we overload a method by just changing its return type?
*/
