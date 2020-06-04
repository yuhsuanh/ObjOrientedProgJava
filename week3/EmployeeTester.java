package pers.gc.copr;

import java.time.LocalDate;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setFirstName("YuHsuan");
		employee.setLastName("Huang");
		employee.setAddress("1 Georgian Dr., Barrie ON L4M 3X9");
		employee.setPhoneNumber("705.728.1968");
		employee.setEmployeeId("200443723");
		
		Employee employee2 = new Employee("Winnie", "Lai", "200123123");
		
		//LocalDate.of(year, month, dayOfMonth)
		LocalDate birth = LocalDate.of(2020, 1, 1);
		employee.setDateOfBirth(birth);
		
		System.out.println("First and last name: " + employee.getFirstName() + " " + employee.getLastName() + "\n" +
				"Address: " + employee.getAddress() + "\n" + 
				"Phone number: " + employee.getPhoneNumber() + "\n" +
				"Date of Birth: " + employee.getDateOfBirth() + "\n" + 
				"Employee ID: " + employee.getEmployeeId());
		
		System.out.println();
		
		System.out.println(employee.toString());
		
		System.out.println();
		
		System.out.println(employee2.toString());
	}
	
}
