package day39.String;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
//		Creating String object using literals
		String s1="pune";//new object will be created and stored in String constant pool
		String s2="mumbai";//new object will be created and stored in String constant pool
		
		String s3="pune";//as its a duplicate to s1,hence no object creation it will point to existing object s1 		
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("Comparing s1 and s2 with '==' "+(s1==s2));
	
		System.out.println("Comparing s1 and s2 with 'equals()' "+s1.equals(s2));
		
		System.out.println("**************************************");

		System.out.println("Comparing s1 and s3 with '==' "+(s1==s3));
		
		System.out.println("Comparing s1 and s3 with 'equals()' "+s1.equals(s3));

		System.out.println("**************************************");

		//String object creation using new keyword
		
		String s4 =new String("Delhi");//two object will be created 1. in SCP 2 in NCP
		
		String s5=new String("Delhi");//one object will be created. 1. in NCP
		
		System.out.println("s4 : "+s4);
		System.out.println("s5 : "+s5);
		
		System.out.println("Comarrinng s4 and s5 with 'equals()' "+s4.equals(s5));
		
		System.out.println("Comarrinng s4 and s5 with '==' "+(s4==s5));
		
		
		System.out.println("Program Ends");
	}
	
	/*
	 * String :- 
	 * 		->Predefined class belongs to java.lang package
	 * 		-> its represent group of charachers or sequence of charachter , all charachter will be store d in index bais 
	 * 		-> it immutable class which mean one object it created its value cant be changed , if change it will create new object 
	 * 				-> Object can be created in 2 ways
	 * 				1. using literal ""; It will create uniquw object inside String constant pool 
	 * 				2. using new keyboard : it wont check uniquess of object will creating object that mean here duplicate object are allowed
	 * 					
	 * 		in String class below mentioned Object class methods are overrided
			toString()---> it print value stored inside the object instead of fully Qualified class name
			equals(Object obj) -> it will compare two objects based on values instead of address
			== -> it will compare two object based on address instead of values
	 */
}
