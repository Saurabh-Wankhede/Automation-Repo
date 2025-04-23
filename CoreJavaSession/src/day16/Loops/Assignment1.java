package day16.Loops;
//WAP To check given number prime or not
public class Assignment1 {

	public static void main(String[] args) {
		
		int num=6,ct=0;
		
		for (int i = 1; i <= num; i++) {

			if (num%i==0) {
				ct++;
			}
			
		}
		if (ct==2) {
			
			System.out.println("Given Number is Prime= "+num);
		}else {
			System.out.println("Not A Prime Number");
		}
		
		
	}
}
