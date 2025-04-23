package day31.Package2;


public class AccessPublicMembers3 {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		Package.PublicMembers p1=new Package.PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
		Package.PublicMembers p2=new Package.PublicMembers();
		
	}
}