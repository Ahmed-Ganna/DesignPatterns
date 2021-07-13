package structural.adapter;

import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		
		List<Employee> employees = client.getEmployees();
		
		System.out.println(employees);
	}
}