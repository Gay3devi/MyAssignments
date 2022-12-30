package week1.day2.assignments;

public class FindFibanoicSeries {

	public static void main(String[] args) {
	int fib=1;
	int n2,n3=0;
	for(int i=0;i<=10;i++) {
	
		n2=fib+n3;
		System.out.print( n3 + " + ");
		fib=n3;
		n3=n2;
	}
	}

}
