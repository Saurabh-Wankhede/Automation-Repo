package day12.Operators;


public class Example2 {

	public static void main(String[] args) {
		int num1=55,num2=11;
		boolean cond1=(num1==num2);
		boolean cond2=(num1>num2);
		System.out.println("Condition1: "+cond1);//f
		System.out.println("Condition2: "+cond2);//t
		boolean res1=(cond1 && cond2);//f
		boolean res2=(cond1 || cond2);//t
		
		System.out.println("Result1: "+res1);
		System.out.println("Result2: "+res2);
		
		System.out.println((num1!=num2)&&(num1>=num2));
							//t			  //t
		System.out.println((num1!=num2)||(num1>=num2));
							//t 		  //t
	}

}
/*
LHS && RHS
	cond1 && cond2 && cond3
			true: when all condition values are true
			false: if anyone condition also failed dn result will be false 

LHS || RHS
	cond1 || cond2 || cond3
			true: if any condition gives you result as true dn final result will be true
			false: if all condition gives you result as false dn final result will be false
*/