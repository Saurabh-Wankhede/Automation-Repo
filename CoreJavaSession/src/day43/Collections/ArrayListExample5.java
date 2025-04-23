package day43.Collections;

import java.util.ArrayList;
import java.util.List;

class Book{
	int id;
	String name, author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity) {
		
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class ArrayListExample5 {

	public static void main(String[] args) {
		//Creating list of Books 
		
		List<Book> list=new ArrayList<Book>();
		
		//Createing Books
		Book b1=new Book(101, "Let us C", "Yaswant kanetkar", "BPB", 8);
		Book b2=new Book(102, "Data Communications and Networking", "Forouzan", "MC Graw Hill", 4);
		Book b3=new Book(103, "Operating System","Galvin", "Wiley", 6);
		
		//Adding Books TO List
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(new Book(104,"Let us code it","xyz","abc",5));
		
		System.out.println("List of Book class elements: " + list);
		System.out.println(list.get(0).name);// Let us C
		System.out.println(list.get(0).id);//101
		System.out.println(list.get(0).publisher);//BPB
		System.out.println(list.get(0).author);//Yashwant Kanetkar
		System.out.println(list.get(0).quantity);//8
		System.out.println(b1.name);
		
		// Traversing list
		
		for (Book b : list) {
			System.out.println(b.id+" || "+b.name+" || "+b.author+" || "+b.publisher+" || "+b.quantity);
		}
		
		
	}
}
