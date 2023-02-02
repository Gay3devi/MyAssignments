package week4.day1.assignments;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicate {
	
	public static void main(String[] args) {
		
		int[] data= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer>sets=new TreeSet<Integer>();
		Set<Integer>printset=new TreeSet<Integer>();
		
		for(Integer output:data) {
		if(!sets.add(output))				{
			printset.add(output);
		
	}}System.out.println(printset);

}
}