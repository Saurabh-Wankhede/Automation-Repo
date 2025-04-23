package day21.MethodOverloading;

public class Sample1 {

	public static void main(String[] args) {


				System.out.println("Program Starts");
				Sample1 ref=new Sample1();
				ref.getInterest2(550000, 7, 9.5);
				//System.out.println(ref.getInterest2(550000, 7, 9.5));//method with return type void can't be written inside println()
				
				ref.getInterest();
				
				//ref.checkPrimeNumber(23);//here method body will be executed but return value won;t be printed
				System.out.println("Is given number prime? "+ref.checkPrimeNumber(25));
				System.out.println("Program Ends");
			}
			
			void getInterest2(int p,int t, double r) {//int p=650000; int t=7; double r=9.5;
				double res;
				res=(p*r*t)/100;
				System.out.println("Principal Amount is: "+p);
				System.out.println("Interest is: "+r);
				System.out.println("Interest on Principal Amount is: "+res);
				System.out.println("Final Account with interest: "+(p+res));
			}	
			public void getInterest() {
				int p=550000,t=5;
				double r=8.5,res;
				res=(p*r*t)/100;
				System.out.println("Principal Amount is: "+p);
				System.out.println("Interest on Principal Amount is: "+res);
				System.out.println("Final Account with interest: "+(p+res));
			}
			
			boolean checkPrimeNumber(int num) {
				int ct=0;
				System.out.println("Given number is: "+num);
				for(int i=1;i<=num;i++) {
					if(num%i==0) {
						ct++;
					}
				}
				if(ct==2) {
					return true;
				}else {
					return false;
				}
			}
		}
		/*
		WAP
			to check given number is even or not
			to check given number is prime or not
			to get reverse number of given number
		*/
	
