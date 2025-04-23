package day43.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample6 {

	public static void main(String[] args) {
		
		//Generic: with the help of generic we can force 
			//collection to store similar type of data
	
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(10);
		a1.add(2);
		a1.add(15);
		a1.add(20);
	System.out.println("Size : "+a1.size());
	System.out.println("Element of Collection : "+a1);
	
	Collections.reverse(a1);
	System.out.println("Reversing sorted Elements of collection: "+a1);
	
	ArrayListExample6 a6=new ArrayListExample6();
	a6.display();
	
	List<ArrayListExample6> l1=new ArrayList<ArrayListExample6>();
	l1.add(new ArrayListExample6());
	l1.add(a6);
	
	l1.get(0).display();
	l1.get(1).display();//a6.display();
	
	
	
	
	}
	void display() {
		System.out.println("Hi, I am display method");

}
}
