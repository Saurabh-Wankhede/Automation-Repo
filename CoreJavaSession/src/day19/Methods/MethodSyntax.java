package day19.Methods;

/**
 * This class contains method examples
 * @author Asus
 *
 */
public class MethodSyntax {
	/**
	 * Method type: Static
	 * Access Modifier: default
	 * non-access Modifier: static
	 * return type: void
	 * method name: testMyCode
	 * argument: NO
	 * return value:NO 
	 */
	static void testMyCode() {
		
		//return;// its completely optional, if you don't write it dn java compiler will write on behalf of you
	}
	/**
	 * Method type:nonStatic 
	 * Access Modifier: private
	 * non-access Modifier: nonStatic
	 * return type: double
	 * method name: getSalary
	 * argument:  No
	 * return value:double 
	 */
	private double getSalary() {
		System.out.println("");
		return 15.356;
	}
	/**
	 * Method type: nonStatic
	 * Access Modifier: protected
	 * non-access Modifier: nonstatic
	 * return type: int
	 * method name: emoId
	 * argument:  No
	 * return value:Int 
	 */
	protected int empId() {
		int x=101;
		return x;
	}

	/**
	 * Method type: nonstatic
	 * Access Modifier: public
	 * non-access Modifier: nonstatic
	 * return type: void
	 * method name: deptNum
	 * argument:  int
	 * return value: void
	 */
	public void deptNum(int num) {

	}
	/**
	 * Method type: static
	 * Access Modifier: default
	 * non-access Modifier: static
	 * return type: void
	 * method name: deptNum2
	 * argument:  String
	 * return value: NA
	 */
	static void deptNum2(String num) {
		
	}
	/**
	 * Method type: Static
	 * Access Modifier: default
	 * non-access Modifier: static
	 * return type: boolean
	 * method name: deptNum3
	 * argument:  int
	 * return value: boolean
	 */
	static boolean deptNum3(int num) {
		boolean res=(num==15);
		return res;
	}

	/**
	 * Method type: nonStatic
	 * Access Modifier: private
	 * non-access Modifier: nonstatic
	 * return type: char
	 * method name: deptNum4
	 * argument:  boolean
	 * return value: char A
	 */
	private char deptNum4(boolean b1) {
		return 'A';
	}

	/**
	 * Method type: Static
	 * Access Modifier: public
	 * non-access Modifier: static 
	 * return type: void
	 * method name: main
	 * argument:  String
	 * return value: NA
	 */
	public static void main(String[] args) {

	}
}
/*
Method or function both are same
- it contains set of repetitive statements or reusable statements
- it can be two types
		- static
		- non static
- Syntax:
			modifier returntype methodname(args)
			{	
				.........;//statement1
				.........;//statement2
				.........;//statement3
				return value;
			}
	where: 
			modifier = accessmodifier + nonaccessmodifier;
			
				- accessmodifers --> define visibility of the class members
						* private
						* default
						* protected
						* public
				
				- non-accessmodifers ---> 
						* static/non-static
						* abstract 
						* native & etc
			
			returntype: define type of value method should return
						* datatype - primitive or non-primitive datatype
						* void (return value statement is optional) --> won't return any value to JVM
		
			methodname: valid identifier
			
			args: argument/parameter ---> optional ----> primitive or non-primitive datatype
			
			 return value---> based on return type, value should be return from the method
*/
