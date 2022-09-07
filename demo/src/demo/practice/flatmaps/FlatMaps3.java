package demo.practice.flatmaps;

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

public class FlatMaps3 {

	public static void main(String[] args) {
		
		List<Employee> employee1 = new ArrayList<Employee>();
		employee1.add(new Employee(1,"Ian",110000));
		employee1.add(new Employee(2,"Nina",120000));
		employee1.add(new Employee(3, "Paul", 100000));

		List<Employee> employee2 = new ArrayList<Employee>();
		employee2.add(new Employee(4,"Steven",90000));
		employee2.add(new Employee(5,"Kat",92000));
		employee2.add(new Employee(6, "Mickal", 91000));
		
		List<Employee> employee3 = new ArrayList<Employee>();
		employee3.add(new Employee(7,"Candice",94000));
		employee3.add(new Employee(8,"Joseph",95000));
		employee3.add(new Employee(9, "Phoibe", 93000));
		
		List<List<Employee>> employee= Arrays.asList(employee1,employee2,employee3);
		
		List<Integer> finaleEmp= new ArrayList<Integer>();	
		
		finaleEmp=	employee.stream().flatMap(emp->emp.stream().map(x->x.salary)).collect(Collectors.toList());
		
		
		//List<String> finaleEmp= new ArrayList<String>();
		
		//finaleEmp=	employee.stream().flatMap(emp->emp.stream().map(x->x.empname)).collect(Collectors.toList());
	
		System.out.println(finaleEmp);
	}

}
