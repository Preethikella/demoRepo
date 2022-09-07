package demo.practice.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersPractice1 {
	public static void main(String[] args) {
		
		List<String> names= Arrays.asList("Swathi","Preethi","Sahithi","Sruthi","Sravnthi");
		List<String> namesList= new ArrayList<String>();
		
		namesList= names.stream().filter(name->name.length()>6).collect(Collectors.toList());
		System.out.println(namesList);
	}

}
