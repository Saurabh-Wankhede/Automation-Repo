package day34.NonPrimitive;

class GrandFather2 {
	void myHome() {
		System.out.println("Grandfather's home");
	}
}
class Father2 extends GrandFather2 {
	void myCar() {
		System.out.println("Father's car");
	}
}

class Child2 extends Father2 {
	void myBike() {
		System.out.println("Child's bike");
	}
}
public class NonPrimitiveCasting3 {
	public static void main(String[] args) {
		//down casting-> is not possible directly in java, only upcasted object can be down casted
//		Child2 c1=new GrandFather2();
//		Child2 c2=new Father2();
		
		Father2 f1=new Child2();//AutoUpcasting
		f1.myHome();
		f1.myCar();
		
		Child2 c1=(Child2)f1;//downcasting - explicit
		c1.myBike();
		c1.myCar();
		c1.myHome();
	}
}
/*
child-> Home,Car,Bike
father-> Home,Car
Grandfather->Home

*/
