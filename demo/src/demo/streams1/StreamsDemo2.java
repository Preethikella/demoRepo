package demo.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsDemo2 {

	public static void main(String[] args) {
		
		List<String> stringList1 = Arrays.asList("apple","mango","banana","orange","grapes");
		
		//findAny
		 Optional<String> value1 = stringList1.stream().findAny();
		 System.out.println(value1.get());
		 
		 
		 List<String> stringList2 = Arrays.asList("apple","mango","banana","orange","grapes");
			
			//finFirst
			 Optional<String> value2 = stringList2.stream().findFirst();
			 System.out.println(value2.get());


	}

}
