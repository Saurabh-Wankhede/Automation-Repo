package day35.Array;

public class Array2 {

	public static void main(String[] args) {
		//Create an array
		int[] age= {12,2,25,6,9};
		//access each array elements
		System.out.println("Accessing Element of Array :");
		
		System.out.println("First Element: "+age[0]);
		System.out.println("Second Element: "+age[1]);
		System.out.println("Third Element: "+age[2]);
		System.out.println("Four Element: "+age[3]);
		System.out.println("Fifth Element: "+age[4]);
		System.out.println("Array Size: "+age.length);
		
		System.out.println("***************Using for Loop:");
		
		for(int i=0;i<age.length;i++) {
//			System.out.println(age[i]);
			if (age[i] == 25) {
				System.out.println(age[i]+" is present at index "+i);
				break;
			}
		}
		System.out.println("************Using for-each Loop:");
		
		for(int a:age) {
//			System.out.println(a);
			if (a==25) {
				System.out.println(a+" is present on index");
				break;
			}
			
		}
	}
}
