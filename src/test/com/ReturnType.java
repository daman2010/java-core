package test.com;

public class ReturnType {
	int ret(int num1 ,int num2) {
		int sum;
		//int sum2;
		sum=num1-num2;
		//sum2=num3-num4;
	
		
		if(sum>=0) {
			System.out.println("this is positive");
	return sum ;
		}
		else {
			System.out.println("negative");
			return -1;
		}
		
		//else if(sum<=0) {
			//System.out.println("this is positive");
			//return sum;
		//}
		
		//else {
			//System.out.println("this is positive");
		//}
		
		 
		 
		//else if (sum2<0) 
		//	System.out.println("this is negative ");
		//return sum2 ;
		 
		//else {
			//System.out.println("this is no ");
		}
		
	}

