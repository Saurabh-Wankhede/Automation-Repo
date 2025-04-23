package day34.NonPrimitive;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		calling(123);
		System.out.println(display(50));	
		System.out.println("Program ends");
	}
	
	static void calling(double d) //double d=123;//implicit widening
	{
		System.out.println("calling number is: "+d);
	}
	
	static int display(float num) {//float num=50;//implicit widening
		System.out.println("I am displaying "+num);
		return (int)num;//explicit narrowing
	}

}
