package demo.practice.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersPractice {

	public static void main(String[] args) {
	
      List<Integer> numList= Arrays.asList(5,7,2,6,3,8);
      List<Integer> oddNumList= new ArrayList<Integer>();
      
      oddNumList =numList.stream().filter(num->num%2==1).collect(Collectors.toList());
      System.out.println(oddNumList);
      
	}

}
