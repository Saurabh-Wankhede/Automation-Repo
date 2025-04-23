package day32.Encapsulation;

class SampleEncap{
	private int empId=101;
	private double salary=45000;
	/*
	 * getter method: this method will help us get private variable from outside the class
	 * 		a method having
	 * 			access modifier: public
	 * 			return type: should same as required private variable datatype
	 * 			methodname: any, better to start with "get"
	 * 			argument: not required
	 * 			return value: should be required private variable
	 */
	public int getEmpId() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
	/*
	 * setter method: this method will help us update private variable from outside the class
	 * 		a method having
	 * 			access modifier: public
	 * 			return type: should be "void"
	 * 			methodname: any, better to start with "set"
	 * 			argument: should same as required private variable datatype
	 * 			return value: Not applicable
	 */
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		SampleEncap ref=new SampleEncap();
//		System.out.println("private empId: "+ref.empId);// compile time error as variable are declared as private
//		System.out.println("private salary: "+ref.salary);// compile time error as variable are declared as private
		
		System.out.println("private empId: "+ref.getEmpId());
		System.out.println("private salary: "+ref.getSalary());
		
		ref.setEmpId(501);
		ref.setSalary(55000);
		System.out.println("updated, private empId: "+ref.getEmpId());
		System.out.println("updated, private salary: "+ref.getSalary());
		
		SampleEncap ref2=new SampleEncap();
		System.out.println("ref2, private empId: "+ref2.getEmpId());
		System.out.println("ref2, private salary: "+ref2.getSalary());
	}

}