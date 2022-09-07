package demo.streams1;

import java.util.HashSet;
import java.util.Set;

public class StreamsDemo1 {

	public static void main(String[] args) {
	
		Set<String> fruits = new HashSet<String>();
		
		fruits.add("one apple");
		fruits.add("two apples");
		fruits.add("two mangoes");
		fruits.add("one melon");
		fruits.add("two melons");
		
		//anyMatch
		boolean resutl= fruits.stream().anyMatch(value-> { return value.startsWith("one");});
		
		System.out.println(resutl);
		
		//allMatch
	     resutl= fruits.stream().allMatch(value-> { return value.startsWith("one");});
		
		System.out.println(resutl);

		
		 //noneMatch
		 resutl= fruits.stream().noneMatch(value-> { return value.startsWith("four");});
			
		 System.out.println(resutl);
	}

}
