package demo.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class DemoStreams3 {

	public static void main(String[] args) {
		
		List<String> stringList= Arrays.asList("1","A","2","B","3","C","4","D");
		
		Object arr[] = stringList.stream().toArray();
		
		System.out.println(arr.length);
		
		for(Object v:arr) {
			
			System.out.println(v);
			
		}

	}

}
