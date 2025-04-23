package day37.PredefinedClasses;

class Sample {
	void display() {
		System.out.println("I am display of Sample class");
	}
}

public class Example1 extends Sample{

	public static void main(String[] args) {
		System.out.println("Program Start ");

		Example1 ref=new Example1();
		ref.display();
		ref.calling();
		System.out.println("Example1 ref value is : "+ref.toString());
		System.out.println("Example1 ref value is : "+ref);//toString() will called by java compiler
		System.out.println("ref Address in interger : "+ref.hashCode());//1510467688
		
		Example1 ref1=new Example1();
		System.out.println("Example1 ref value is : "+ref1.toString());//toString() will called by java compiler
		System.out.println("ref Address in interger : "+ref1.hashCode());//1995265320
		System.out.println("Comparing ref and ref1 based on address : "+ref.equals(ref1));
		
		
		Example1 ref2=ref1;
		System.out.println("Example1 ref2 value is :- "+ref2.toString());
		System.out.println("Example1 ref2 value is :- "+ref2.hashCode());
		System.out.println("Comparing ref2 and ref1 based on address : "+ref2.equals(ref1));
		
	
		System.out.println("Program End ");
	}

	void calling() {
		System.out.println("I am calling from Example class");
	}
}

/*
 * Object Class :- 
 * 		-> Predefine class, belongs to java.lang package, for this no to import explicitliy
 * 		-> its a super most or parent most class in java 
 * 		-> this class has multiple useful method like - 
 * 			-> toString() :- 
 * 				-Public method with retrun type String 
 * 				-This will give you strin representsion of object(Fullyqualifiedclassname@hexadecimalnumber)
 * 			
 * 			-> hashCode() :-
 * 				-Public method with retrun type int 
 * 				-this will convert hexadecimalnumber into integer.
 * 
 * 			-> equals() :- 
 * 				-public with retrun type boolean
 * 				-this will is used to compare two object vased on address
 * 
 * 	NOTE : OBJECT CLASS METHOD CAN BE OVERRIDEN BASED ON THE NEED
 */
