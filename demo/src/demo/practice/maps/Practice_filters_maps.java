package demo.practice.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
 {
	 int empid;
	 String empname;
	 int salary;
	 
	public Employee(int empid, String empname, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	 
	
}


public class Practice_filters_maps {

	public static void main(String[] args) {
		
		List<Employee> employee= Arrays.asList(
				new Employee(1,"Matt",20000),
				new Employee(2,"Kat",30000),
				new Employee(3,"Candice",33000),
				new Employee(4,"Nina",75000),
				new Employee(5,"Ian",65000),
				new Employee(6,"Paul",40000));
		List<String> empSalList = new ArrayList<String>();
		
	//	empSalList= employee.stream().filter(e->e.salary >30000)
		           //       .map(e->e.empname)
		         //         .collect(Collectors.toList());
		
	//	System.out.println(empSalList);

	employee.stream().filter(e->e.salary >30000)
                .map(e->e.empname)
                .forEach(e->System.out.println(e));
		
	}

}
