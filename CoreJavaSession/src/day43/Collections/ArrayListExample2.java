package day43.Collections;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		System.out.println("Initial list of element "+a1);
		System.out.println("list of elements status "+a1.isEmpty());
		
			//Add element to the end of the list 
		a1.add("Ravi");
		a1.add("vijay");
		a1.add("pooja");
		a1.add("saurabh");
		System.out.println("After invoking add(E e) method: "+a1);//to get specific class behavior dn we need downcast the object
		
		String s1=(String)a1.get(0);//downcasting to get sring class behaviour
		
		System.out.println(s1.length());
		
		// Adding an element at the specific position
		a1.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + a1);
		
		ArrayList al2 = new ArrayList();
		al2.add("Sonoo");
		al2.add("Hanumat");
		// Adding second list elements to the first list
		System.out.println("List al2 element: " + al2);
		System.out.println("al element before adding al2: " + a1);
		a1.addAll(al2);
		System.out.println("List al element after adding list al2: " + a1);
		
		ArrayList al3=new ArrayList();
		al3.add("John" );
		al3.add("Rahul ");
		System.out.println("Elements of al2: " + al2);
		System.out.println("Elements of al3: " + al3);
	
		// Adding second list elements to the first list at specific position System.out.println("Element of");
		
		al2.addAll(1, al3);
		System.out.println("After adding al3 into al2 : "+al2);
		al2.add(al3);
		
		
	}

}
