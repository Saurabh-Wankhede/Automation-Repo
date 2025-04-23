package day34.NonPrimitive;


class GrandFather {
	void myHome() {
		System.out.println("Grandfather's home");
	}
}

class Father extends GrandFather {
	void myCar() {
		System.out.println("Father's car");
	}
}

class Child extends Father {
	void myBike() {
		System.out.println("Child's bike");
	}
}

public class NonPrimitiveCasting1 {
	public static void main(String[] args) {
		Child ref1 = new Child();
		ref1.myBike();
		ref1.myCar();
		ref1.myHome();

		// Upcasting - AutoUpCasting/Implicit Upcasting
		Father ref2 = new Child();// upcasting -->compiler will write-> Father ref2 =(Father)new Child();
		GrandFather ref3 = new Child();// upcasting
		GrandFather ref4 = new Father();// upcasting
		// or
		Father ref5 = ref1;// upcasting
		GrandFather ref6 = ref1;// upcasting

		// Upcasting - explicit Upcasting
		Father ref7 = (Father) new Child();// upcasting
		GrandFather ref8 = (GrandFather) new Child();// upcasting
		GrandFather ref9 = (GrandFather) new Father();// upcasting
		// or
		Father ref10 = (Father) ref1;// upcasting
		GrandFather ref11 = (GrandFather) ref1;// upcasting

	}
}