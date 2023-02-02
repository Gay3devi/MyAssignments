package week4.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateSets {

	public static void main(String[] args) {

		String text="we learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
	Set<String> list=new LinkedHashSet<String>(Arrays.asList(split));
		for(String output:list)
			System.out.print(output + " ");
			}
	
			
		
		}
		
	
	
	


