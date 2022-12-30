package week1.day2.assignments;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) { 
		int arr[]= {6,8,9,3,4,2,7,5};
		Arrays.sort(arr);
		int sum1;
		int sum2=0;
		int missingnumber;
		int n=arr.length;
		sum1=((n)*(n+1)/2);	//
		for(int i=0;i<=n-2;i++) {
		sum2=sum2+arr[i];
							}missingnumber=sum1-sum2;
							System.out.println(missingnumber);
	}
		
		
		
		}
		
	
	


