package day20.MethodsDetails;


public class Sample2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
//		The Number is Even Or Odd
		Sample2.evenOrOdd(4);
		
		System.out.println("**********************");
//		For Number is prime or not 
		System.out.println(	"given no is  "+Sample2.PrimeOrNot(5));
		
		System.out.println("**********************");
//		The Number is Resvrese 
		System.out.println("Reverse Number Is "+Sample2.reverseNumber(123));
		System.out.println("Program Ends");
	}
	
	static void evenOrOdd(int num) {
		
		if(num%2==0) {
			System.out.println("Number is Even");
		}else {
		System.out.println("Number is Odd");
		}
		
	}
	static int PrimeOrNot(int num) {
		int count=0,i=1;
		for(;i<=num;i++) {
			if (num%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("Given Number is Prime Number");
			int res=num;
			return res;
		}else {
			System.out.println("Given Number NOT A Prime Number");
			int res=num;
			return res;
		}
		
	}
	static int reverseNumber(int num) {
		
		System.out.println("Reverse Number of this Number "+num);
		int rem=0,rev=0;
		for(;num!=0;) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
		
	}
	
	
}
/*
WAP
	to check given number is even or not
	to check given number is prime or not
	to get reverse number of given number
*/
