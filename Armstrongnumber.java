package week1.day1;

public class Armstrongnumber {
	public static void main(String[] args) {
int num = 153;
int calc=0;
int rem;
int original;
original=num;
while(num>0){
	rem=num%10;
	num =num/10;
	calc = (rem*rem*rem) + calc;
}
	if(calc == original) {
		System.out.println("It is armstrong number");
	}
	else {
		System.out.println("It is not a armstrong number");
	}
	
	}
}

		

		


		
