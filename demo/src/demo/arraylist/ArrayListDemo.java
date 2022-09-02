package demo.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(2);
		al.add("welcome");
		al.add(19.94);
		al.add(true);
		al.add('P');
		
		System.out.println(al);
	
		//size
		System.out.println("Number of elements in arrayList:"+" "+ al.size());
		
		
		//remove
		al.remove(1);
		//al.remove("welcome");
		
		System.out.println("ArrayList after removing the element:"+" "+al);
		
		//add
		al.add(3, "Java");
		
		System.out.println("After insertion:"+" "+al);
		
		//retrieve specific element
		System.out.println(al.get(2));
		
		//replace an element
		al.set(2, false);		
		System.out.println("After replacing the element"+" "+al);
		
		//searching
	System.out.println(al.contains("Python"));
		
	System.out.println(al.contains("Java"));                
	
	//isEmpty
	System.out.println(al.isEmpty());
	
	 //(1)for loop
	
	System.out.println("Reading elements using for loop");
     for(int i=0;i<al.size();i++) {
    	 System.out.println(al.get(i));
	}
     
     //(2)for each
     
     System.out.println("Reading elements using for each");
     for(Object e:al) {
    	 System.out.println(e);
     }
     
     //(3)Iterator method 
     System.out.println("Reading elements using Iterator method");
	 Iterator it = al.iterator();
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
	
		
	}

}
