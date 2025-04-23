package day35.Array;

class Testasrray2{
	//Creating a method which recevies an array as a parameter 
	
	static void min(int arr[]) {//int arr[]=a{33,13,4,50,15,1};
		int min=arr[0];//33
		for(int i=1;i<arr.length;i++) {
			if (min>arr[i]) {//33>13 | 13>4 |4>50 | 4>15 |4>1
				
				min=arr[i];//13 | 4 | 1
				
			}
		}
		System.out.println("Min Number in array is : "+min);
	}
	static void max(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max number in array is : "+max );
	}
	
	static void avg(int arr[]) {
		int sum=0;
		double avrage;
	
		for(int a: arr) {
			sum+=a;
		}
		
//		System.out.println("Sum of Number is : "+sum);
		avrage=sum/arr.length;
		System.out.println("Average of Array is : "+avrage);
	}
}
public class Array4 {
	
	public static void main(String[] args) {
		int a[]= {33,13,4,50,15,1};//declaring and initalizing an array
		
		Testasrray2.min(a);//Passing array to method 
		System.out.println();
		Testasrray2.max(a);//Passing array to method 
		System.out.println();
		Testasrray2.avg(a);
	}

}
