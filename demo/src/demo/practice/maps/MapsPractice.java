package demo.practice.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapsPractice {
	
	public static void main(String[] args) {
		
		//upper case to lower case
		List<String> vehicles= Arrays.asList("CAR","BUS","TRAIN");
		List<String> vehiclesinLowerCase= new ArrayList<String>();
		
		vehiclesinLowerCase= vehicles.stream().map(name->name.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(vehiclesinLowerCase);
		
		//lower case to upper case
		List<String> vehicles1= Arrays.asList("car","bus","train");
		List<String> vehiclesinUpperCase= new ArrayList<String>();
		
		vehiclesinUpperCase= vehicles1.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(vehiclesinUpperCase);
	}
	
	

}
