package pers.gc.copr;

import java.time.LocalDate;

public class Employee {
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String employeeId;
	private LocalDate dateOfBirth;
	
	//Constructors
	public Employee() { }

	public Employee(String firstName, String lastName, String address, String phoneNumber, String employeeId, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.employeeId = employeeId;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Employee(String firstName, String lastName, String employeeId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
	}

	//Getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	@Override
	public String toString() {
		String info = "First and last name: " + this.firstName + " " + this.lastName + "\n" +
					"Address: " + this.address + "\n" + 
					"Phone number: " + this.phoneNumber + "\n" +
					"Date of Birth: " + this.dateOfBirth + "\n" + 
					"Employee ID: " + this.employeeId;
		return info;
	}
	
}
