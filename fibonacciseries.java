package week1.day1;

public class fibonacciseries {
	public static void main(String[] args) {
		int fnum = 0;
		int snum = 1;
		int n=8;
		int sum;
		//System.out.println("fnum");
		
		for(int i=1;i<=n;i++) {
			System.out.println(fnum);
			sum=fnum+snum;
			//System.out.println(sum);		    
			fnum=snum;
			snum=sum;
			}
}
}
