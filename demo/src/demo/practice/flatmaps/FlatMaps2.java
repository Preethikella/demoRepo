package demo.practice.flatmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlatMaps2 {

	public static void main(String[] args) {
		
		List<String> list1= Arrays.asList("Ian","Nina","Paul");
		List<String> list2= Arrays.asList("Steven","Kat","Mickey");
		List<String> list3= Arrays.asList("Candice","Joseph","Phoibe");
		
		List<List<String>> finalList= new ArrayList<List<String>>();
		
		finalList.add(list1);
		finalList.add(list2);
		finalList.add(list3);
		
		List<String> finalResult= new ArrayList<String>();
		
		finalResult= finalList.stream().flatMap(list->list.stream().map(x->x.toUpperCase())).collect(Collectors.toList());

		System.out.println(finalResult);
	}

}
