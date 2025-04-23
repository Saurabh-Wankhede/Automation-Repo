package day31.Package2;

public class Sample2 {

	public static void main(String[] args) {
		/// using fully qualified class name accessible public member
		Package.Example1 ref = new Package.Example1();
		System.out.println("Accessing public num4 of Example1 class from Sample2: " + ref.num4);

		Package.Example1 ref2 = new Package.Example1();
		System.out.println("Accessing public num4 of Example1 class from Sample2: " + ref2.num4);
	}

}