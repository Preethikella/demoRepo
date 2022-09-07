package demo.streams1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	
	public static void main(String[] args) {
		
		//sorted
		
		//Integers
		List<Integer> list1 = Arrays.asList(6,3,8,1,9,7,2);
		
		List<Integer> sortedList1 = list1.stream().sorted().collect(Collectors.toList());
		
		List<Integer> sortedList2 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(sortedList1);
		System.out.println(sortedList2);
		
		//Strings
		
		List<String> list2 = Arrays.asList("Ian","Nina","Paul","Candice","Kat");
		
		
		List<String> sortedList3 = list2.stream().sorted().collect(Collectors.toList());
		
		List<String> sortedList4 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(sortedList3);
		System.out.println(sortedList4);
		
	}


}
