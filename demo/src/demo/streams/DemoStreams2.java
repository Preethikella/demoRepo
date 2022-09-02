package demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoStreams2 {

	public static void main(String[] args) {
		List<String> stringList= Arrays.asList("1","A","2","B","3","C","4","D");
		
	Optional<String> reduced=	stringList.stream().reduce((value, combinedValue)->{return combinedValue+value;});

	System.out.println(reduced.get());
	}

}
