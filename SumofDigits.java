package Assignments;

public class SumofDigits {

	public static void main(String[] args) {

		int sum =123;
		int q=1;
		int r=0;
	while(q!=0) {
		q=sum/10;
		r=sum%10+r;
		sum=q;
		}		
	System.out.println("sum of numbers is:"+r);
	
	}
}

