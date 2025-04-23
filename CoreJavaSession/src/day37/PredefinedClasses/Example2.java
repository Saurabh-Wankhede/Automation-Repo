package day37.PredefinedClasses;
class Sample2{
	void display() {
		System.out.println("I am dislpay of Sample class");
	}
}
public class Example2 extends Sample2 {
	
	@Override
	public String toString() {
		
		return "Hello From Example 2 ";
	}
	@Override
	public int hashCode() {
		
		return 105;
	}
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Program strat");
		Example2 ref=new Example2();
		System.out.println("Example1 ref value is :"+ref);//toString() will be called by java compiler
		System.out.println("ref Address in integer: "+ref.hashCode());
		
		Example2 ref1=new Example2();
		System.out.println("Example1 ref1 value is: "+ref1.toString());
		System.out.println("ref1 Address in integer: "+ref1.hashCode());
		System.out.println("Comparing ref and ref1 based on adress : "+ref.equals(ref1));
		
		Example2 ref2=ref1;
		System.out.println("Example1 ref2 value is: "+ref2.toString());
		System.out.println("ref2 Address in integer: "+ref2.hashCode());
		System.out.println("Comparing ref2 and ref1 based on address: "+ref2.equals(ref1));
		
		Sample2 s1=new Sample2();
		System.out.println("Sample2 s2 value is : "+s1);
		System.out.println("s2 Adderss in integer : "+s1.hashCode());
		
		Sample2 s2=new Sample2();
		System.out.println("Sample2 s2 value is : "+s2);
		System.out.println("s2 Adderss in integer : "+s2.hashCode());
		System.out.println("Comparing s1 and s2 based on address : "+s1.equals(s2));
		
		
		System.out.println("Program End");
	}
	void calling() {
		System.out.println("I am calling from Example1 class");
	}
}
/*
Object class:
	predefined class, belongs to java.lang package, for this no to import explicitly
	its a super most or parent most class in java
	this class has multiple useful methods like-
		- toString() - public with return type String--> this will give you string representation of object(Fullyqualifiedclassname@hexadecimalnumber)
		- hashCode() - public with return type int--> this will convert hexadecimalnumber into integer
		- equals()   - public with return type boolean--> this is used to compare two objects based on address
		
		NOTE: Object class methods can be overriden based on the need
*/
