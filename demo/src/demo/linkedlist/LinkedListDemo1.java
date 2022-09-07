package demo.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
	
		LinkedList<String> l = new LinkedList<String>();
		l.add("x");
		l.add("y");
		l.add("z");
		l.add("a");
		l.add("b");
		l.add("c");
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.addAll(l);
		
		System.out.println(l1);
		
		l1.removeAll(l);
		System.out.println("After removing:"+l1);
		
		//sorting
		System.out.println("Elements in the array list"+l);
		
		Collections.sort(l);
		System.out.println("Elements in the array list after sorting"+l);
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Elements in the array list after sorting"+l);

		
		//Shuffle
		
				Collections.shuffle(l);
				System.out.println("Elements in the array list after sorting"+l);

	}

}
