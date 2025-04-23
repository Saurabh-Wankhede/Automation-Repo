package day42.Exception_2;

public class CustomExceptionExample2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		display();
		checkAge(15);
		System.out.println("Program Ends");
	}

	static void display() {
		System.out.println("I am display method");
		checkAge(25);
	}

	static void checkAge(int age) {
		if (age < 18) {
			try {
				throw new SaurabhException("Sorry, Your age is below 18...");
			} catch (SaurabhException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("You are welcome, as your age validation is completed..");
		}
	}
}
