package day35.Array;

public class Array3 {

	public static void main(String[] args) {

		int[] numbers = { 2, -9, 0, 5, 12, -25, 9, 8, 12 };

		double sum = 0;
		double average;
		// Access all elements using for each for loop add each elelment in sum
		
		for(int number :numbers) {
			sum=sum+number;//0+2=2+(-9)=-7
			//OR
//			sum+=number//===> sum = sum + number;
			
		}
		//Get the number of tottal elements
		int arrayLength = numbers.length;
		// Calculate the average convert the average from int to double
		
		average =sum/arrayLength;
		System.out.println("Sum =  "+sum);
		System.out.println("Average = "+average);
		
	}

}
/**
 * WAP to get average of array elements
 * 
	10,20,30,40,50====> 10+20+30+40+50=150/5
 */
