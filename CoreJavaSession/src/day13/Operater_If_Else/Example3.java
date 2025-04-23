package day13.Operater_If_Else;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int age=18;
		char bldGrp='O';
		if(age>=18) {
			System.out.println("Age verification is successful");
			if(bldGrp=='A') {
				System.out.println("You can donate the blood.");
			}else {
				System.out.println("Sorry, your blood group doesn;t match");
			}
		}else {
			System.out.println("Sorry, you are below age");
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