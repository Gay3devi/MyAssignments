package week3.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
String input ="changeme";
char[] charArray = input.toCharArray();
for(int i=0;i<input.length();i++) {
	if(i%2!=0) {
		//System.out.print(charArray[i]);
		charArray[i]=Character.toUpperCase(charArray[i]);
		
		
	}System.out.print(charArray[i]);
}
	}

}
