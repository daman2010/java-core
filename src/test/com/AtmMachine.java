package test.com;

public class AtmMachine {
 void atm(int num1,int num2 , int num3 , int num4 , int amt) {
	 if (num1==2 && num2==4 && num3==7 && num4==0)
		 System.out.println("You Are Password is correct  "+"***"+num4);
	 if(amt >=1) {
		 System.out.println("Withdraw you are cash "+amt);
		 System.out.println("welcome again visit Our Atm");
	      
	 }
	 else 
		 System.out.println("You Are Password is incorrectly check again ");
	 
	 
	 
 }
}
