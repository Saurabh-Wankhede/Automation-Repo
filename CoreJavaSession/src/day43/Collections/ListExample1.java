package day43.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		
		System.out.println("Program start");
//		ArrayList ref=new ArrayList();
					
					//OR
		
		List ref=new ArrayList();
			
		ref.add("pune");//String object will be upcasted to object class object (Auto up Casting)
		ref.add(150);//int will be converted in Integer class Object class object (boxing),
		//dn Integer class object will be updated to object class object(auto upcasting)
		
		ref.add("pune");
		ref.add(null);
		
		
		
		System.out.println("Program End");
	}
}
