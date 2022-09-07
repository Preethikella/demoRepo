package demo.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.addAll(al);
		
		System.out.println(al1);
		
		al1.removeAll(al);
		System.out.println("After removing:"+al1);
		
		//sorting
		System.out.println("Elements in the array list"+al);
		
		Collections.sort(al);
		System.out.println("Elements in the array list after sorting"+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements in the array list after sorting"+al);
		
		//Shuffle
		
		Collections.shuffle(al);
		System.out.println("Elements in the array list after sorting"+al);

	}

}
