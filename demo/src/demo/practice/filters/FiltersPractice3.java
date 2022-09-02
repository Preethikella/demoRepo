package demo.practice.filters;

import java.util.Arrays;
import java.util.List;


class Employee{
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

public class FiltersPractice3 {

	public static void main(String[] args) {
		
		List<Employee> employee= Arrays.asList(
				new Employee(1,"Matt",20000),
				new Employee(2,"Kat",30000),
				new Employee(3,"Candice",33000),
				new Employee(4,"Nina",75000),
				new Employee(5,"Ian",65000),
				new Employee(6,"Paul",40000));		
		
		employee.stream().filter(sal->sal.salary >30000).forEach(sal->System.out.println(sal.empid));
	
	}

}
