package day22.ConstrutorUsingThis;

public class Example3 {
	int num;
	public static void main(String[] args) {

		System.out.println("Program start");

		Example3 ref = new Example3();
		ref.calling();
		ref.calling(5568);
		System.out.println("Program End");
	}

	void calling() {
		System.out.println("I am calling you on: " + num);
	}

	void calling(int num) {
		
		System.out.println("I am calling you on: " + num);
//	as local variable name is same as global variable
//	in order to diff them we need to create an instance of a class

		Example3 ex = new Example3();
		System.out.println("NSGV num: " + ex.num);
		// OR
		System.out.println("NSGV num using This: " + this.num);

	}
}
/*
 * this keyword: current class instance using this we can access non-static
 * members it can be used only inside nonstatic method or constructor mainly
 * used to diff when nonstatic method local variable name is same as nonstatic
 * global variable
 */