	package day22.ConstrutorUsingThis;


public class Example4 {
	int num;

	public Example4(int num) {
		System.out.println("I am int - param con...");
		System.out.println("Local variable num: "+num);
		System.out.println("Before initialization global variable num: "+this.num);
		//Global variable =local variable
		this.num=num;
		System.out.println("After initializing globale variable num: "+num);
		
	} 
	public static void main(String[] args) {
	
		System.out.println("Program starts");
		Example4 ref=new Example4(125);
		
		System.out.println("Program End");
		
	}
}


/*
this keyword:
	current class instance
	using this we can access non-static members
	it can be used only inside nonstatic method or constructor
	mainly used to diff when nonstatic method local variable name is same as nonstatic global variable
*/
