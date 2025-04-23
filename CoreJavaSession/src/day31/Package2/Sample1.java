package day31.Package2;

import day31.Package.Example1;

public class Sample1 extends Example1{

	public static void main(String[] args) {
		Example1 ref=new Example1();
		//compile time error as default member are not accessible from outside the package
		//System.out.println("Accessing default num2 from Sample1 of pack2: "+ref.num2);
		
		//compile time error as protected members are not accessible from outside the package without inheritance
		//System.out.println("Accessing protected num3 from Sample class: "+ref.num3);
		
		System.out.println("Accessing public num4 from Sample class: "+ref.num4);
		
		Sample1 s1=new Sample1();
		System.out.println("Accessing protected num3 from Sample1 class: "+s1.num3);
		System.out.println("Accessing public num4 from Sample class: "+s1.num4);
		
		Example1 ref2=new Example1();
		System.out.println("Accessing public num4 from Sample class: "+ref2.num4);
	}

}