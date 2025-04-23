package day31.Package;


public class Example2 {

	public static void main(String[] args) {
		Example1 ref=new Example1();
		//in the below line you will get compile time error, as private members can;t be access from outside the class
		//System.out.println("Accessing num1 from Example1 class: "+ref.num1);
		System.out.println("Accessing default num2 from Example2 class: "+ref.num2);
		System.out.println("Accessing protected num3 from Example2 class: "+ref.num3);
		System.out.println("Accessing public num4 from Example2 class: "+ref.num4);
	}

}
