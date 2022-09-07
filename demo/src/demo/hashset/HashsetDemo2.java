package demo.hashset;

import java.util.HashSet;

public class HashsetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		
		HashSet<Integer> hs2 = new HashSet<Integer>();

		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		hs2.add(6);
		
		System.out.println("Hashset1:"+hs1);
		System.out.println("Hashset2:"+hs2);
		
		//union
		//hs1.addAll(hs2);
		//System.out.println("Union"+hs1);
		
		//Intersection
		//hs1.retainAll(hs2);
		//System.out.println("Intersection:"+hs1);
		
		//difference
		//hs1.removeAll(hs2);
		//System.out.println(hs1);
		
		//containsAll
		System.out.println(hs1.containsAll(hs2));
		
		
	}

}
