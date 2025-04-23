package day33.TypeCasting;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1 = 25;
		float num2 = (float) num1;// explicit-widening
		double num3 = num1;// implicit widening --> Java compiler will be double num3=(double)num1;

		double num4 = 25.36;
		float num5 = (float) num4;// explicit narrowing

		System.out.println("Program ends");
	}

}
