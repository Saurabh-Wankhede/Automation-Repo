package day22.ConstrutorUsingThis;


public class Example5 {
	int num;
	Example5(){
		System.out.println("I am zero-param cons...");
	}
	Example5(int num){
		System.out.println("I am int-param cons...");
	}
	Example5(int num,float x){
		System.out.println("I am int-float-param cons...");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example5 ref1=new Example5();
		Example5 ref2=new Example5(10,25.36f);
		Example5 ref3=new Example5(58);
		System.out.println("Program ends");
	}	
	

}
/*
this statement:
	current class instance
*/
