package day39.String;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Sample1 {

	public static void main(String[] args) {

		String s1 = "Pune";
		String s2 = "Pune";
		String s3 = "Mumbai";
		System.out.println("S1: " + s1);
		System.out.println("S2: " + s2);
		System.out.println("S3: " + s3);
		
		
		System.out.println("Compare s1 & s2 based on value :"+s1.equals(s2));
		
		System.out.println("Compare s1 & s2 based on addrese :"+(s1==s2));
		
		System.out.println("***********************************");
		
		System.out.println("Compare s1 & s3 based on value :"+s1.equals(s3));
		
		System.out.println("Compare s1 & s3 based on addrese :"+(s1==s3));
		
		System.out.println("***********************************");

		String s4 =new String("Pune");
		System.out.println("S4 : "+s4);
		System.out.println("Compare s1 & s4  : "+s1.equals(s4));//true based on value check
		System.out.println("Compare s1 & s4 "+(s1==s4));//false
		
		System.out.println("*******************************************");		
		
		String s5="Bangalore";
		System.out.println("S5 : "+s5+" hast total char count as "+s5.length());
		
		char indexZeroChar=s5.charAt(0);
		System.out.println("Zero index char is :"+indexZeroChar);
		
		for (int i = 0; i < s5.length(); i++) {

				System.out.println("char at index "+i+" : "+s5.charAt(i));
				
				System.out.println("*************************************************");
				
				String s6="I am saurabh, I am staing in pune, I am working QA";
				
				System.out.println("s6 : "+s6);
				
				System.out.println("Replace when  : "+s6.replaceFirst("am", "XX"));
				
				System.out.println("s6 : "+s6);
				System.out.println(s6.replace("am", "XX"));
				System.out.println("s6 : "+s6);
				
				System.out.println("*************************************************");
				
				System.out.println("Bangalore substring from 1 to 5 index: "+s5.subSequence(1,5));
				
				System.out.println("*************************************************");


				String x1="Java";
				String x2="Selenium";
				String x3=x1.concat(x2);
				System.out.println("x1: "+x1);
				System.out.println("x2: "+x2);
				System.out.println("x3: "+x3);
				
				String x4=x1+x2;
				System.out.println("x4: "+x4);
		

				String x5=x1+null;
				System.out.println("x5: "+x5);//Javanull
				
				//String x6=x1.concat(null);
//				System.out.println("x6: "+x6);//runtime error
				
				System.out.println("********************************************");
				
				String a1="I am staying in Pune, I am learning Java";
				
				System.out.println("is Chennai have 'Pune' : "+a1.contains("Pune"));
				
				System.out.println("is Chennai ends with 'Java'? '"+a1.endsWith("Java"));
				
				System.out.println("what is the index of 'e' in Chennai: "+a1.indexOf('J'));
		
				System.out.println("what is the index of 'am' in Chennai: "+a1.indexOf("am"));
				
				System.out.println("what is the index of 'a' in Chennai after 8rd index: "+a1.indexOf('P', 4));
					
					System.out.println("is a1 emplty ? "+a1.isEmpty());
					System.out.println("is a1 emplty ? "+a1.isBlank());
					
					System.out.println(a1.lastIndexOf('I'));
					System.out.println(a1.lastIndexOf('a',35));
		}
	}
}
