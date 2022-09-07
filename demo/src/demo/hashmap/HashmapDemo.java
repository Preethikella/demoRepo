package demo.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		
		//HashMap hm = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Ian");
		hm.put(2, "Nina");
		hm.put(3, "Paul");
		hm.put(4, "Candice");
		hm.put(5, "Joseph");
		hm.put(6, "Phoibe");
		
		System.out.println(hm);
		
		//retrieve the value
		System.out.println(hm.get(4));
		
		//remove an entry
		hm.remove(5);
		System.out.println(hm);
		
		//contains
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsKey(7));
		
		System.out.println(hm.containsValue("Paul"));
		System.out.println(hm.containsValue("Daniel"));
		
		//isEmpty
		System.out.println(hm.isEmpty());
		
		//returns all the keys
		System.out.println(hm.keySet());
		
		//returns all the values
		System.out.println(hm.values());
		
		//returns all the entries
		System.out.println(hm.entrySet());
		
		 for(Object e:hm.keySet()) {
	    	 System.out.println(e);
	     }
		 
		 for(Object e:hm.values()) {
	    	 System.out.println(e);
	     }
		 
		 for(Object e:hm.keySet()) {
	    	 System.out.println(e+"  "+hm.get(e));
	     }

		 
		 //entry methods
		 //(1)for each
		 for(Map.Entry entry:hm.entrySet()) {
			  System.out.println(entry.getKey()+"  "+entry.getValue());
		 }
		 
		 //(2)iterator
		 Set s = hm.entrySet();
		 Iterator itr = s.iterator();
		 
		     while (itr.hasNext())
		     {
		    	 Map.Entry entry = (Entry) itr.next();
		    	 System.out.println(entry.getKey()+"  "+entry.getValue());
				
			}

		
	}

}
