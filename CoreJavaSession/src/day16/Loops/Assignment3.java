package day16.Loops;
//WAP To Check Number Is Palimdrom Or Not 
public class Assignment3 {

	public static void main(String[] args) {
		
		int num=121,rem=0,rev=0,temp;
		temp=num;
		for(int i=num;i!=0;i=i/10) {
			
			rem=i%10;
			rev=rev*10+rem;
			
		}

		if (rev == temp ) {
			System.out.println("Given Number is Palidrom Number = "+rev);
		}else {
			System.out.println("Given Number is Not a Palindrom Number");
		}
	}
}
