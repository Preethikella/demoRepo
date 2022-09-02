package demo.practice.maps;

import java.util.Arrays;
import java.util.List;

public class Mapspractice1 {

	public static void main(String[] args) {
		
		List<String> vehicles= Arrays.asList("car","bus","train");
		
    vehicles.stream().map(name->name.length()).forEach(len->System.out.println(len));
	}

}
