package demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreams {

	public static void main(String[] args) {
		//Distinct
		
		List<String> vehicles= Arrays.asList("car","bike","car","train","bus","plane","bus");
		
		List<String> distinctVehicles= new ArrayList<String>();
		
		distinctVehicles= vehicles.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctVehicles);
		
		//count
		long count=vehicles.stream().distinct().count();
		
		System.out.println(count);
		
		//limit
		List<String> limitedVehicles= new ArrayList<String>();
		limitedVehicles= vehicles.stream().limit(4).collect(Collectors.toList());
		System.out.println(limitedVehicles);

	}
	
	

}
