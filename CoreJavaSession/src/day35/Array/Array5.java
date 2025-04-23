package day35.Array;

class TestReturnArray{

	//Creating method which returns an array
	static int[] getArray() {
		int num[]=new int[3];
		num[0]=100;
		num[1]=50;
		num[2]=900;
//		return num;
			//OR
		return new int[]{10,20,50,60,80,70};
}
}
public class Array5 {

	public static void main(String[] args) {
		
		//Calling method which return an array 
		int arr[]=TestReturnArray.getArray();//{ 10, 13,15};
		
		//Printing the value of an array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
