package day16.Loops;

public class Assignment2 {
//WAP TO Reverse Number 
	public static void main(String[] args) {

//		int rem = 0, rev = 0;

//		for (int num = 123; num != 0; num = num / 10) {

//			rem=num%10;
//			rev=rev*10+rem; 	
//		}
//		System.out.println(rev);
	
			//		OR
		
		int num=1234,rem=0,rev=0;
		for(;num!=0;) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		
	}

}
/*
 * 123=100+20+3-->300+20+1

rem=num%10	----> 123%10=3 | 12%10=2  | 1%10=1
rev=rev*10+rem;-> 0*10+3=3 | 3*10+2=32| 32*10+1=321
num=num/10;	   -> 123/10=12| 12/10=1  | 1/10=0

 */
