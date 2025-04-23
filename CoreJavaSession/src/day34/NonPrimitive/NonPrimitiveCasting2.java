package day34.NonPrimitive;

class GrandFather1 {
	void myHome() {
		System.out.println("Grandfather's home");
	}
}
class Father1 extends GrandFather1 {
	void myCar() {
		System.out.println("Father's car");
	}
}

class Child1 extends Father1 {
	void myBike() {
		System.out.println("Child's bike");
	}
}
public class NonPrimitiveCasting2 {
	public static void main(String[] args) {
		Child1 ref1 = new Child1();
		ref1.myBike();
		ref1.myCar();
		ref1.myHome();

//		Father1 ref2=new Father1();
//		ref2.myHome();
//		ref2.myCar();
//		GrandFather1 ref3=new GrandFather1();
//		ref3.myHome();
			//or
		Father1 ref2=ref1;//Upcasting-implicit
		ref2.myHome();
		ref2.myCar();
		GrandFather1 ref3=ref1;
		ref3.myHome();
	}
}
