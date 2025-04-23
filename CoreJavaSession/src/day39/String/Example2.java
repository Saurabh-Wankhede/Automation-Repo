package day39.String;

	public class Example2 {

		public static void main(String[] args) {
			System.out.println("Program Starts");
			//creating String object using literals
			String s1="Pune";//new object will be created and stored in String constant pool
			System.out.println("s1:"+s1);
			
			//String object creation using new keyword
			String s4=new String("Pune");//
			
			System.out.println("s4:"+s4);
			
			System.out.println("comparing s4 and s1 with 'equals()': "+s4.equals(s1));//
			
			System.out.println("comparing s4 and s1 with '==': "+(s4==s1));//
			
			System.out.println("Program Ends");
		}
	
	}
	/*
	String:
		-> predefined class belongs to java.lang
		-> it represent group of characters or sequence of character, all character will be stored in index basis
		-> its immutable class which mean once object it created its value can;t be changed, if you change it will create new object
			-> Object can be created in 2 ways
			1. using literal "": it will create unique object inside String constant pool
			2. using new keyword: it won;t check uniqueness of object while creating object that mean here duplicate object are allowed
				in String class below mentioned Object class methods are overrided
			
			toString()---> it print value stored inside the object instead of fully Qualified class name
			equals(Object obj) -> it will compare two objects based on values instead of address
			== -> it will compare two object based on address instead of values
	*/
	
