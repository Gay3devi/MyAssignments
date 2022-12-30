package week1.day2.assignments;

public class CreatePositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int positive;
		int negative=-67;
		if(negative<0) {
			System.out.println("this is negative");
		}else
		{System.out.println("this is positive");
	}positive = negative *-1;
	if(positive>0) {
	System.out.println("the negative number is converted into positive");

}else {System.out.println("error");

}
	
	for(int i=5; i>=0;i--) {
		for(int j=5; j>=i;j--) {
			System.out.print("*" + " ");
		}System.out.println("");
	}
}
}
