package demo.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("dog");
		l.add("cat");
		l.add("horse");
		
		System.out.println(l);
		
		l.addFirst("tiger");
		l.addLast("lion");
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		l.removeLast();
		System.out.println(l);

	}

}
