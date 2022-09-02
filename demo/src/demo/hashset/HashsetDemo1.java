package demo.hashset;

import java.util.HashSet;

public class HashsetDemo1 {

	public static void main(String[] args) {
	
		HashSet<Integer> evenNum= new HashSet<Integer>();
		
		evenNum.add(2);
		evenNum.add(4);
		evenNum.add(6);
		evenNum.add(8);
		
		System.out.println("Hashset:"+" "+evenNum);
		
		//addAll
		HashSet<Integer> evenNum1 = new HashSet<Integer>();
		evenNum1.addAll(evenNum);
		evenNum1.add(10);
		
		System.out.println("New Hashset:"+""+evenNum1);
		
		//removeAll
		
		evenNum1.removeAll(evenNum);
		System.out.println(evenNum1);

	}

}
