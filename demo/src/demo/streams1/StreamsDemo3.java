package demo.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo3 {
    //concatenating streams
	public static void main(String[] args) {
		List<String> animals = Arrays.asList("Lion","Tiger","Dog");
		List<String> birds = Arrays.asList("Crow","Parrot","Peacock");
		
		Stream<String> stream1 = animals.stream();
		Stream<String> stream2 = birds.stream();

	 List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
		
		System.out.println(finalList);
	}

}
