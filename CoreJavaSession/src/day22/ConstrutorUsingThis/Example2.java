package day22.ConstrutorUsingThis;

public class Example2 {
	int num;

	public static void main(String[] args) {
		System.out.println("Program Start");
		Example2 ref = new Example2();
		ref.calling();
		ref.calling(12345);
		System.out.println("Program End");
	}

	void calling() {
		System.out.println("I am calling you on: " + num);
	}

	void calling(int num) {
		System.out.println("I am calling you on: " + num);
//		as local variable name is same as global variable
//		in order to diffrence them we need to create an instance of a class
		Example2 ex = new Example2();
		System.out.println("NSGV num: " + ex.num);

	}
}
