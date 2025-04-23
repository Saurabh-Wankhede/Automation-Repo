package day39.String;

public class StringBuffer1 {

	
	public static void main(String[] args) {
		
//		String str =new String("Abc");
		/**
		 * Mutable
		 * Thread safe---> no multi threading ---> slow
		 * Object created only using new keyword
		 * size is growable
		 */
		
		StringBuffer sb =new StringBuffer("Hello ");
		System.out.println("Orignal StringBuffer Valur :"+sb);//Hello
		
		sb.append("java");//now original string is changed
		System.out.println(sb);//Hello Java
		
		sb.insert(5, "pune");
		System.out.println(sb);//HelloPune Java
		
		sb.replace(1, 5, "XXX");//HXXXpune java
		System.out.println(sb);
		
		sb.delete(1, 4);//Hpune java
		System.out.println(sb);
		
		StringBuffer s1=new StringBuffer("Banglore is know for IT");
		
		s1.reverse();
		System.out.println(s1 );//TI rof wonk si erolgnaB
		
		System.out.println("**************************************************");
		
		StringBuffer s2=new StringBuffer();
		System.out.println(s2.capacity());//default 16 
		s2.append("Hello");
		System.out.println("First Word: "+s2);
		s2.append(" java is my favourite language");
		System.out.println("2nd Word: "+s2);
		System.out.println(s2.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
		s2.append(" I am from automation area");  
		System.out.println("3rd Word: "+s2);
		System.out.println(s2.capacity());//now (34*2)+2=70 i.e (oldcapacity*2)+2
		
		
		System.out.println();
	
	
	
	
	
	
	}
}
