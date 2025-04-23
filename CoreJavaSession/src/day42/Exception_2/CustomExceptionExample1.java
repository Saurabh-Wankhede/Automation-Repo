package day42.Exception_2;

class SaurabhException extends Exception {

	public SaurabhException(String msg) {
		super(msg);
	}

}

public class CustomExceptionExample1 {

	public static void main(String[] args)  {

		System.out.println("Program Starts");
		display();
//		checkAge(16);
		System.out.println("Program Ends");
	}

	static void display() {
		System.out.println("I am display method ");
		try {
			checkAge(16);

		} catch (SaurabhException e) {
			e.printStackTrace();
		}

	}

	static void checkAge(int age) throws SaurabhException {

		if (age < 18) {
			throw new SaurabhException("Sorry, Your age is below 18 dont dare to come here again... ");
		} else {
			System.out.println("You are welcome, as your age ");
		}
	}

}
