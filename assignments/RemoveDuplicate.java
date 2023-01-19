package week3.day2.assignments;

public class RemoveDuplicate {

	public static void main(String[] args) {
String text="We learn java basics as part of java sessions in java week1"; 
String temp=text;

String[] split = text.split(" "); //Welearnjavabasicsaspartofjavasessionsinjavaweek1

for(int i=0;i<split.length;i++) {
	if(split[i]!=null) {//we!=null
		
	
	for(int j=i+1;j<split.length;j++) {
		
		if(split[i].equals(split[j])) {
			split[j]=null;
		}}}
}

for(int k=0;k<split.length;k++)
{
	if(split[k]!=null) {
		System.out.print(split[k]+ " ");
	}
}
			
		
		
	}
			
		}
	

	



