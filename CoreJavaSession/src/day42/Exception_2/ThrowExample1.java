package day42.Exception_2;

public class ThrowExample1 {

	public static void main(String[] args) {

		System.out.println("Program Strat ");
		checkAge(15);
		System.out.println("Program End ");

	}

	static void checkAge(int age) {
		if (age < 18) {

			throw new ArithmeticException("Sorry , your age is below 18....");
		}else {
			System.out.println("You are welcomee, as your age validation is completed.....");
		}
	}

}
