package week3.day2.assignments;

public class PalindromeString {

	public static void main(String[] args) {
String name="madam";
String rev="";

	for(int i=name.length()-1;i>=0;i--) {
		rev=rev+name.charAt(i);
	}System.out.print(rev);
	if(name.toLowerCase().equals(rev.toLowerCase())) {
		System.out.println("given string is palindrome");
	}else {
		System.out.println("not a palindrome string");
	}
	
	}

}
