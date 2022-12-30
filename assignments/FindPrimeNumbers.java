package week1.day2.assignments;

public class FindPrimeNumbers {

	public static void main(String[] args) {
int input=13;
int count=0;

for(int i=2; i<=input; i++) {
	
	if(input%i==0) {
		count=count+1;
	}}
	if(count==1) {
		System.out.println("this is primenumber");
		
	}
	else {System.out.println("this is not primenumber");

	}}}


