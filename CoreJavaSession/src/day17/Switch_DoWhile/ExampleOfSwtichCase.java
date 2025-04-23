package day17.Switch_DoWhile;

public class ExampleOfSwtichCase {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		char ch = 'a';
		switch (ch) {
		case 'u':
		case 'U':
			System.out.println("Given character is vowel and that is: " + ch);
			break;
		case 'e':
		case 'E':
			System.out.println("Given character is vowel and that is: " + ch);
			break;
		case 'i':
		case 'I':
			System.out.println("Given character is vowel and that is: " + ch);
			break;
		case 'o':
		case 'O':
			System.out.println("Given character is vowel and that is: " + ch);
			break;
		case 'a':
		case 'A':
			System.out.println("Given character is vowel and that is: " + ch);
			break;
		default:
			System.out.println("Given character is not a vowel and that is: " + ch);
		}
		System.out.println("Program Ends");
	}
}
/*
 * 
 * Switch Case check the case one by one based on condtion if any case match
 * with condition that case will get executed
 */
