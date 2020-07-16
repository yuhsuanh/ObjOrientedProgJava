/**
 * Student class
 * 
 * 
 * @author Yu-Hsuan Huang
 * Student#: 200443723
 * Date: 2020/07/08
 */
package registrationsystem;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String postalCode;
	private String courseCode;
	private Integer studentNumber;
	private LocalDate registrationDate;
	private LocalDate studentBirthday;
	
	private Boolean goodStanding;

	List<CompletedCourse> completedCourses;
	
	//Constructors
	public Student() {}
	
	public Student(String firstName, String lastName, String streetAddress, String city, String postalCode,
			String courseCode, Integer studentNumber, LocalDate registrationDate, LocalDate studentBirthday) throws IllegalArgumentException {
		
		//Student age cannot be over 100 years old
		if(Period.between(studentBirthday, LocalDate.now()).getYears() > 100)
			throw new IllegalArgumentException("Please check the year entered, student cannot be over 100 years old");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.postalCode = postalCode;
		this.courseCode = courseCode;
		this.studentNumber = studentNumber;
		this.registrationDate = registrationDate;
		this.studentBirthday = studentBirthday;
		
		goodStanding = true;
		completedCourses = new ArrayList<CompletedCourse>();
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
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public Integer getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public LocalDate getStudentBirthday() {
		return studentBirthday;
	}
	public void setStudentBirthday(LocalDate studentBirthday) {
		this.studentBirthday = studentBirthday;
	}
	public void setBirthday(LocalDate studentBirthday) {
		this.studentBirthday = studentBirthday;
	}


	
	
	/**
	 * Using student birth to get age
	 * @return
	 */
	public int getStudentAge() {
		if(getStudentBirthday() != null) {
			return Period.between(getStudentBirthday(), LocalDate.now()).getYears();
		} else {
			return 0;
		}
	}

	/**
	 * Change student address which includes street address, city and postal code
	 * @param streetAddress
	 * @param city
	 * @param postalCode
	 */
	public void changeAddress(String streetAddress, String city, String postalCode) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.postalCode = postalCode;
	}
	
	/**
	 * Get full address
	 * @return
	 */
	public String getStudentAddress() {
		return getStreetAddress() + " " + getCity() + " " + getPostalCode();
	}
	
	/**
	 * Return the student is in good standing or not in good standing
	 * @return
	 */
	public Boolean studentInGoodStanding() {
		return goodStanding;
	}
	
	/**
	 * Change the student good standing to false
	 */
	public void suspendStudent() {
		goodStanding = false;
	}
	
	/**
	 * Change the student standing to good standing
	 */
	public void reinstateStudent() {
		goodStanding = true;
	}
	
	/**
	 * Get which year the student enrolls in school
	 * @return
	 */
	public Integer getYearEnrolled() {
		return getRegistrationDate().getYear();
	}
	
	/**
	 * Add course which the student already completed 
	 * @param course
	 * @param grade must between 0 and 100 otherwise throw exception
	 * @throws IllegalArgumentException
	 */
	public void addCompletedCourse(Course course, Integer grade) throws IllegalArgumentException {
		if(grade < 0 || grade > 100) {
			throw new IllegalArgumentException("grade must be 0-100 inclusive");
		}
		
		completedCourses.add(new CompletedCourse(course, grade));
	}
	
	/**
	 * Get courses which the student already completed
	 * @return
	 */
	public String getCoursesCompleted() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("[");
		for(int i=0; i<completedCourses.size(); i++) {
			if(i>0)
				strBuilder.append(", ");
			
			strBuilder.append(completedCourses.get(i));
		}
		strBuilder.append("]");
		return strBuilder.toString();
	}
	
	/**
	 * Determine if the student has completed this course
	 * @param course
	 * @return
	 */
	public boolean hasCompleted(String course) {
		for(CompletedCourse completedCourse: completedCourses) {
			if(completedCourse.getCourse().getCourseCode().equals(course) && completedCourse.getGrade() >= 50) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Override toString method 
	 * Return string which combines first name, last name and  student number
	 */
	@Override
	public String toString() {
		return getFirstName() + " " + getLastName() + ", student number: " + getStudentNumber();
	}
	
}
