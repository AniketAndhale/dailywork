package aniket12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;



public class StreamAPI2 {
	public static void main(String[] args) {
		List<Employee1> employees =new ArrayList<Employee1>();
		addEmployees(employees);
		employees.forEach(System.out::println);
		List<Employee1> ageScale =employees.stream().filter(emp ->emp.getAge() < 22 ).collect(Collectors.toList());
		System.out.println("Employee with age less than 22");
		ageScale.forEach(System.out::println);
		//List<Double> salaryscale =employees.stream().map(emp ->emp.getSalary()*1.1 ).collect(Collectors.toList());
		//System.out.println("salary incresed");
		//salaryscale.forEach(System.out::println);
		List<Employee1> salaryscale =employees.stream().map(emp ->{emp.setSalary(emp.getSalary()*1.1); return emp; } ).collect(Collectors.toList());
		System.out.println("salary incresed");
		salaryscale.forEach(System.out::println);
	}
	
	private static void addEmployees(List<Employee1> employees) {
		Employee1 emp1 = new Employee1(211,"aniket","maharashtra",20,5555898L,5842.00);
		Employee1 emp2 = new Employee1(212,"abin","kerla",23,55555898L,58882.00);
		Employee1 emp3 = new Employee1(213,"sai","andra",24,5555898L,584256.00);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		
		
	}

}
