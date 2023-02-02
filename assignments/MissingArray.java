package week4.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingArray {

	public static void main(String[] args) {			
		int[] arra= {101,103,105,104,107,108,200};
		int length=arra.length;//6
		System.out.println(length);
		List<Integer>arrlist=new ArrayList<Integer>();
		//Collections.sort(arrlist);//1234678
		for(int i=0;i<length;i++) {//0<7//1<7/3/4/5/6/
			arrlist.add(arra[i]);//1//2//3/4/6/7/8/
		}
		Collections.sort(arrlist);
		System.out.println(Collections.max(arrlist));
		List<Integer>seclist=new ArrayList<Integer>();
		for(int i=Collections.min(arrlist);i<Collections.max(arrlist);i++) {
			System.out.println(i);
			if(!arrlist.contains(i)) {
				seclist.add(i);
			}
		}
		System.out.println(seclist);


//Set<Integer>set=new TreeSet<Integer>();
//for(int i=0;i<arra.length;i++) {
//	set.add(arra[i]);
//}
//
//Set<Integer>set1=new LinkedHashSet<Integer>();
//for(int i=1;i<arra.length;i++)
//{if(!set.contains(i)) {
//	set1.add(arra[i]);
//}
//	}System.out.println(set1);
//}
	}
}