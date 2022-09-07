package demo.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.add("D");
		pq.add("E");
		pq.offer("E");
		System.out.println(pq);
		
		//getting an element //element() //peek()		
		System.out.println(pq.element());
		System.out.println(pq.peek());
		
		//removing header element 
		//remove() 
	//	System.out.println(pq.remove());
		//System.out.println(pq);
		//poll()
		//System.out.println(pq.poll());
		//System.out.println(pq);
		
		 //Iterator method 
	  //   System.out.println("Reading elements using Iterator method");
		// Iterator it = pq.iterator();
		// while(it.hasNext()) {
			// System.out.println(it.next());
		 //}
		
		  //for each
	     
	     System.out.println("Reading elements using for each");
	     for(Object e:pq) {
	    	 System.out.println(e);
	     }

	}

}
