package demo.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashtableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(101, "Ian");
		ht.put(102, "Paul");
		ht.put(103, "Nina");
		
		System.out.println(ht);
		
		//get
		System.out.println(ht.get(101));
		
		//remove
		ht.remove(103);
		System.out.println(ht);
		
		//contains	key
		System.out.println(ht.containsKey(102));
		System.out.println(ht.containsKey(104));
		
		//contains value
		System.out.println(ht.containsValue("Ian"));
		System.out.println(ht.containsValue("Daniel"));
		
		//isEmpty
		System.out.println(ht.isEmpty());
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		//for each
		for(int s:ht.keySet()) {
			
			System.out.println(s+"  "+ht.get(s));
		}
		
		for(Map.Entry entry:ht.entrySet()) {
			  System.out.println(entry.getKey()+"  "+entry.getValue());
		 }
		
		 //iterator
		 Set s = ht.entrySet();
		 Iterator itr = s.iterator();
		 
		     while (itr.hasNext())
		     {
		    	 Map.Entry entry = (Entry) itr.next();
		    	 System.out.println(entry.getKey()+"  "+entry.getValue());
				
			}


	}

}
