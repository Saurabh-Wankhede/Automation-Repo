package day13.Operater_If_Else;
//Program to check character vowel or consonent
public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		char ch='K';
		if(ch=='a' || ch=='A') {
			System.out.println("Given character is vowel: "+ch);
		}else if(ch=='e'|| ch=='E') {
			System.out.println("Given character is vowel: "+ch);
		}else if(ch=='i'|| ch=='I') {
			System.out.println("Given character is vowel: "+ch);
		}else if(ch=='o'|| ch=='O') {
			System.out.println("Given character is vowel: "+ch);
		}else if(ch=='u'|| ch=='U') {
			System.out.println("Given character is vowel: "+ch);
		}else {
			System.out.println("Given character is consonent: "+ch);
		}
		System.out.println("Program Ends");
	}
}
/*
if(condition){
	//statements
}else if(condition){
	//statements
}else if(condition){
	//statements
}else{
	//statements
}
*/