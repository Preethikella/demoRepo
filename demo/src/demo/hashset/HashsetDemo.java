package demo.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
	
	
		HashSet hs = new HashSet(); //default capacity 16, load factor 0.75
		
		//HashSet<Integer> hs = new HashSet<Integer>();
		//HashSet hs = new HashSet(100); //initial capacity 100
	//	HashSet hs = new HashSet(100, (float)0.90);
		

		hs.add(2);
		hs.add("welcome");
		hs.add(19.94);
		hs.add(true);
		hs.add('P');
		hs.add(null);
		
		System.out.println(hs);
		
		//remove
		hs.remove(2);
		System.out.println("After removing:"+" "+hs);
		
		//contains
		System.out.println(hs.contains('P'));
		System.out.println(hs.contains('S'));
		
		//isEmpty
		
		System.out.println(hs.isEmpty());
		
		//(1)for each
	     
	     System.out.println("Reading elements using for each");
	     for(Object e:hs) {
	    	 System.out.println(e);
	     }
	     
	     //(2)Iterator method 
	     System.out.println("Reading elements using Iterator method");
		 Iterator it = hs.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }

	}

}
