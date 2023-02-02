package week4.day1.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindInterSection {

	public static void main(String[] args) {
		//int a1[]= {3,2,11,4,6,7};
		//int a2[]= {1,2,8,4,9,7};
		
		
		//ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		//ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		//ArrayList<Integer> al3 = new ArrayList<Integer>();
		Set<Integer> set1=new HashSet<Integer>();
				set1.add(3);
		set1.add(2);
		set1.add(11);
		set1.add(4);
		set1.add(6);
		set1.add(7);
		Set<Integer> set2=new HashSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(8);
		set2.add(4);
		set2.add(9);
		set2.add(7);
		Set<Integer>intersection=new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		
		
		//System.out.println(al1);
		//System.out.println(al2);
		//Iterator it=al1.iterator();
		//Iterator it1=al2.iterator();
		//while(it.hasNext()) {
	//		while(it1.hasNext()) {
		//		if(it.next()==it1.next()) {
			//		System.out.println(it1.next());
				//}
			//}
		}
	}
	
	
	
	
	/* list<integer>arr1.list =new ArrayList<Integer>();
	
for(int i=0;i<arr1.length;i++){
arr1list1.add(arr1[i]);	}
	
	
	 list<integer>arr2.list =new ArrayList<Integer>();
	
for(int i=0;i<arr2.length;i++){
arr1list1.add(arr2[i]);	}
if(arrlist.get(i).equals(arr2list.get(i))){
System.out.println(arr1list.get(i));
}

	
	
	
	
	
	
	
	
	
	/* public static void main(String[] args) {
		int set[]={3,2,11,4,6,7};
		 int set2[]= {1,2,8,4,9,7};
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		for(int i=0;i<set.length;i++) {
			for(int j=0;j<set2.length;j++) {
				if(set[i]==set2[j]) {
					//Set<Integer>intersection=new HashSet<Integer>();
					//System.out.println(set[j]);
					if(!finalList.contains(set[j])) {
						finalList.add(set2[j]);
					}
				}
			
			}
		}
		System.out.println(finalList);
		
	}*/
	
	/*public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		System.out.println(al1);
		System.out.println(al2);
		for (Integer i: al1) {
			for(Integer j: al2) {
				if(i==j) {
					al3.add(j);
				}
			}
		}
		System.out.println(al3);
		
	}*/

		//Set<int>intersection=nentlnw HashSet<int>();
	


