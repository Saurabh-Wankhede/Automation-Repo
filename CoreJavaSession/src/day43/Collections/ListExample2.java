package day43.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {

		System.out.println("Program Starts");

//		ArrayList ref=new ArrayList();

		// OR
		List ref = new ArrayList();

		ref.add("Pune");// String object will be upcasted to Object class object(Auto up casting)
		ref.add(120);// int will be converted in Integer class object(boxing), dn Integer class
						// object will be updated to Object class object(auto upcasting)
		ref.add("Pune");
		ref.add(null);
		System.out.println("Total element in ArrayList: " + ref.size());
		System.out.println("Element inside ArrayList: " + ref);

		List ref2=new ArrayList();
		
		ref2.add("Saurabh");//String object will be upcasted to Object class object(Auto up casting)
		ref2.add("Surbhi");//int will be converted in Integer class object(boxing), dn Integer class object will be updated to Object class object(auto upcasting)
		
		System.out.println("Total element int ArrayList2 : "+ref2.size() );
		System.out.println("Element inside ArrayList2: "+ref2);	//add ref2 elements into ref arraylist at the end
		
		ref.addAll(ref2);
		
		System.out.println("**********After addAll  **************");
		System.out.println("Total element int ArrayList2 : "+ref.size() );
		System.out.println("Element inside ArrayList2: "+ref);	
		
		ref.removeAll(ref2);
		System.out.println("**********After removeAll method**************");
		System.out.println("Total element int ArrayList2 : "+ref.size() );
		System.out.println("Element inside ArrayList2: "+ref);	
		
		ref.addAll(4,ref2);
		
		System.out.println("**********After addAll ref based on index **************");
		System.out.println("Total element int ArrayList2 : "+ref.size() );
		System.out.println("Element inside ArrayList2: "+ref);	
		
		System.out.println("Program End");

	}

}
