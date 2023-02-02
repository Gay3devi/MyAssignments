package week4.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.bouncycastle.operator.OutputAEADEncryptor;

import com.graphbuilder.struc.LinkedList;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] data= {3,2,11,4,6,7};
		List<Integer> largest=new ArrayList<Integer>();
		for(int i=0;i<data.length;i++) {
		largest.add(data[i]);
			
		}Collections.sort(largest);//{2,3,4,6,7,11}
		Integer integer = largest.get(largest.size()-2);
		System.out.println(integer);
	}

}




