package day43.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListExample1 {

	public static void main(String[] args) {
		int ar[]= {1,3,5,54,6,5,56,5};
		List list =new ArrayList();//Creating arraylist
		
		list.add("mango");//auto upcating from String to object class object
		list.add("Apple");
		list.add("Banana");
		list.add("123");// Printing the arraylist object
		System.out.println("Size of list :"+list.size() );
			System.out.println("Elements of list: " + list);
		
			// accessing particular element
		System.out.println(list.get(2));
		System.out.println("Traversing list through for loop:");
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			
//		}
		     //OR
		for (Object fruits : list) {
			System.out.println(fruits);
		}
		
		// changing the element
			list.set(1, "Dates");
			System.out.println("size of list: " + list.size());	

			//Sorting the list
			Collections.sort(list);//by default it sort the passed collection element in assending 
				//order and store it in the same collection
			
			System.out.println("size of list: " + list.size());
			System.out.println("Elements of list: " + list);

			System.out.println("Traversing list through forEach() method:");
		
			list.forEach(a -> { // Here, we are using lambda expression
				System.out.println(a);
			});
			
			System.out.println("Traversing list through Iterator interface:");
			
			Iterator itr=list.iterator();
			/**
			 * List element: [123,Banana,Dates,Mango]
			 * Iterator is a Interface in collection, which is used to iterate collection elements
			 * Iterator interface has following method to iterate collection elements
			 * 1. hasNext() ---> boolean --> true next element is present, false no next element
			 * 2. next() ---> Object --> it will return next element from collection, if no element present dn return NoSuchElementException
			 * 3. remove() --> void --> element deletion
			 * Iterator object can be use to iterate a collection only once, for 2nd iteration create new Iterator object
			 */
			
//			System.out.println(itr.hasNext());
//			System.out.println(itr.next());//123
//			System.out.println(itr.next());//Banana
//			System.out.println(itr.next());//Dates
//			System.out.println(itr.next());//mango
			
			System.out.println(itr.next());//NoSuchElementException
			
			while (itr.hasNext()) {
					System.out.print(itr.next()+" ");
			}
			System.out.println("*******with new Iterator Object************");
			Iterator itr2 = list.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
			
			
			}

}
