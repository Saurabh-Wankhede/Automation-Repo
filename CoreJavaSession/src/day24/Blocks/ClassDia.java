package day24.Blocks;

public class ClassDia {
	static int num1 = 10;
	double num2 = 25.56;

	static int getNum1() {
		return num1;
	}

	void calling(boolean status) {
		System.out.println("I am calling");
	}

	public static void main(String[] args) {
		System.out.println("Program Strat");
		ClassDia cl=new ClassDia();
		cl.calling(true);
		System.out.println(cl.getNum1());
		System.out.println("Program End");
	}

}
