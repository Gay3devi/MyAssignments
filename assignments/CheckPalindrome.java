package week1.day2.assignments;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=34343;
		int temp=num;
		int reminder;
		int reverse=0;
		
	 	
	 
	
			 for(int i=0; num>i;)
			 {
				reminder= num%10;
				reverse= reverse*10+reminder;
				num=num/10;
				
				System.out.println(reverse);// this line is to check how the reverse function works
						
			}
			if(temp==reverse) {
			System.out.println("this is palindrome");
			}else {
				System.out.println("this is not palindrome");
			}}
}