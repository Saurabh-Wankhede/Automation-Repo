package day31.Package;

public class Example1{
	private int num1=10;
	int num2=50;
	protected int num3=100;
	public int num4=150;
	public static void main(String[] args) {
		Example1 ref=new Example1();
		System.out.println("Accessing num1 from Example1 class: "+ref.num1);
		System.out.println("Accessing default num2 from Example1 class: "+ref.num2);
		System.out.println("Accessing protected num3 from Example1 class: "+ref.num3);
		System.out.println("Accessing public num4 from Example1 class: "+ref.num4);
	}
}
/*
private members(variable and method):
	members declared with private keyword will be accessible within the class only
default members:
	members declared with default will be accessible within package label
protected members:
 	members declared with protected will be accessible with in the package as well as 
 	from outside the package using inheritance
public members:
	members declare with public will be accessible from anywhere
	we can access from outside the class by directly object creation
	or
	we can take a help of fully qualified class
NOTE: in order to access protected or public member from outside make sure the class 
	  where these members are declare that class is defined as public
*/
