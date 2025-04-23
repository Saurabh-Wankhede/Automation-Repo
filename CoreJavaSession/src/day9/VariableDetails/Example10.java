package day9.VariableDetails;



public class Example10 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		
		// declaring same type of multiple variables
		
		int variable1, variable2, result;
		variable1 = 10;
		variable2 = 20;
		
		result = variable1 + variable2;
		
		System.out.println("Variable1=" + variable1);
		System.out.println("Variable2=" + variable2);
		System.out.println("Addition Result=" + result);
		
		// re-initialization
		
		variable1 = 850;
		result = variable1 - variable2;
		System.out.println("Variable1=" + variable1);// 850
		System.out.println("Variable2=" + variable2);// 20
		System.out.println("Substraction Result=" + result);// 830
		
		// re-initialization
		
		variable1 = 20;
		variable2 = 60;
		result = variable1 * variable2;
		System.out.println("Variable1=" + variable1);// 20
		System.out.println("Variable2=" + variable2);// 50
		System.out.println("Multipication Result=" + result);// 1200
		
		// re-initialization
		
		variable2 = 100;
		result = variable2 / variable1;
		System.out.println("Variable1=" + variable1);// 20
		System.out.println("Variable2=" + variable2);// 100
		System.out.println("Multipication Result=" + result);// 5
		
		// re-initialization
		
		variable1=51;
		variable2 = 7;
		result = variable1 % variable2;
		
		System.out.println("Variable1=" + variable1);// 51
		System.out.println("Variable2=" + variable2);// 7
		System.out.println("MOD Result=" + result);// 2
		System.out.println("Program Ends");
	}
}
/*
 * Variable1=10 Variable2=20 Result=30
 */
