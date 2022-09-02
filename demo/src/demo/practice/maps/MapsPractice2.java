package demo.practice.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapsPractice2 {

	public static void main(String[] args) {
	
		List<Integer> numberList= Arrays.asList(2,5,7,9,8);
		List<Integer> multipliedList= new ArrayList<Integer>();	
		
	//	multipliedList = numberList.stream().map(num->num*4).collect(Collectors.toList());
		//System.out.println(multipliedList);

		 numberList.stream().map(num->num*4).forEach(num->System.out.println(num));
	}

}
