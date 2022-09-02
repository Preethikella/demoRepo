package demo.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add(2);
		l.add("welcome");
		l.add(19.94);
		l.add(true);
		l.add('P');
		l.add(null);
		
		System.out.println(l);
		
		System.out.println(l.size());
		
		//remove
		l.remove(2);
		System.out.println("Linked List after removing an element:"+" "+l);
		
		//adding a new element	
		l.add(2, 26.22);
		System.out.println("Linked List afetr the insertion of element:"+" "+l);
		
		//retrieving an element
		System.out.println(l.get(2));
		
		//changing the value 
		l.set(4, 'S');
		System.out.println("After changing the value:"+" "+l);

		//Contains
		System.out.println(l.contains("welcome"));
		System.out.println(l.contains("hello"));
		
		
		//is empty or not
		System.out.println(l.isEmpty());
		
		 //(1)for loop
		
		System.out.println("Reading elements using for loop");
	     for(int i=0;i<l.size();i++) {
	    	 System.out.println(l.get(i));
		}
	     
	     //(2)for each
	     
	     System.out.println("Reading elements using for each");
	     for(Object e:l) {
	    	 System.out.println(e);
	     }
	     
	     //(3)Iterator method 
	     System.out.println("Reading elements using Iterator method");
		 Iterator it = l.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}

}
