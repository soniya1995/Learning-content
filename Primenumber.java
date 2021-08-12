package Assignments;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =13;
		boolean s=false;
		int rem;
		for(int i=2;i<=num/2;i++) {
			rem=num%i;
			if(rem==0) {
				s=true;
			}break;
			}
			if(s==false){
				System.out.println("Number is prime");
		}
			else{
		System.out.println("Number is not prime");
			}
	}
}
			
