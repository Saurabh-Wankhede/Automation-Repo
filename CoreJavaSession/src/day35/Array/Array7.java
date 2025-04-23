package day35.Array;

class Examples{
	int age;
	double salary;
	public Examples() {
		System.out.println("zero-Param");
	}
	public Examples(int a) {
		age=a;
		System.out.println("Int-Param");
	}
	public Examples(double a) {
		salary=a;
		System.out.println("double-Param");
	}
	void calling() {
		System.out.println("Calling of Example1 class, age: "+age);
		System.out.println("Calling of Example2 class, salary: "+salary);
		
	}

}

public class Array7 {

	public static void main(String[] args) {
	
		System.out.println("******************************");
//		Examples e1=new Examples();
//		Examples e2=new Examples(15);
//		Examples e3=new Examples(55.2);
//		e1.calling();
//		e2.calling();
//		e3.calling();
//		
		System.out.println("*******************************");
//		Examples[] e=new Examples[] {new Examples(),new Examples(15),new Examples(25.36)};
					//OR
//		Examples[] e= {new Examples(),new Examples(15),new Examples(12.3)};
		     		//OR
		Examples[] ex=new Examples[3];
		ex[0]=new Examples();
		ex[1]=new Examples(77);
		ex[2]=new Examples(65.65);
		
		ex[0].calling();//
		ex[1].calling();
		ex[2].calling();
		
	}
}
