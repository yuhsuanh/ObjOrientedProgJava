/**
 * Instructor class
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

public class Instructor {

	private String firstName;
	private String lastName;
	private Integer instructorNumber;
	private String streetAddress;
	private String city;
	private String postalCode;
	private LocalDate inaugurationDate;
	private LocalDate instructorBirthday;
	
	private List<String> courses; 

	//Constructors
	public Instructor() {}
	public Instructor(String firstName, String lastName, Integer instructorNumber, String streetAddress, String city,
			String postalCode, LocalDate inaugurationDate, LocalDate instructorBirthday) {
		
		//Inauguration years cannot be over 80 years
		if(Period.between(inaugurationDate, LocalDate.now()).getYears() > 80)
			throw new IllegalArgumentException(inaugurationDate.toString() + " as a hire date would mean " + firstName + " started working over 80 years ago");
		//Instructor age cannot be over 100 years old
		if(Period.between(instructorBirthday, LocalDate.now()).getYears() > 100)
			throw new IllegalArgumentException("Please check the year entered, instructor cannot be over 100 years old");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.instructorNumber = instructorNumber;
		this.streetAddress = streetAddress;
		this.city = city;
		this.postalCode = postalCode;
		this.inaugurationDate = inaugurationDate;
		this.instructorBirthday = instructorBirthday;
		
		courses = new ArrayList<String>();
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
	public Integer getInstructorNumber() {
		return instructorNumber;
	}
	public void setInstructorNumber(Integer instructorNumber) {
		this.instructorNumber = instructorNumber;
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
	public LocalDate getInaugurationDate() {
		return inaugurationDate;
	}
	public void setInaugurationDate(LocalDate inaugurationDate) {
		this.inaugurationDate = inaugurationDate;
	}
	public LocalDate getInstructorBirthday() {
		return instructorBirthday;
	}
	public void setInstructorBirthday(LocalDate instructorBirthday) {
		this.instructorBirthday = instructorBirthday;
	}
	
	
	
	/**
	 * Get the instructor age
	 * @return
	 */
	public Integer getAgeInYears() {
		if(getInstructorBirthday() != null) {
			return Period.between(getInstructorBirthday(), LocalDate.now()).getYears();
		} else {
			return 0;
		}
	}
	
	/**
	 * Get the instructor inauguration years in college
	 * @return
	 */
	public Integer noOfYearsAtCollege() {
		if(getInaugurationDate() != null) {
			return Period.between(getInaugurationDate(), LocalDate.now()).getYears();
		} else {
			return 0;
		}
	}
	
	/**
	 * Get instructor full address
	 * @return
	 */
	public String getInstructorAddress() {
		return getStreetAddress() + ", " + getCity() + ", " + getPostalCode();
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
	 * Get What subjects did the instructor teach
	 * @return
	 */
	public String listOfSubjectsCertifiedToTeach() {
		if(courses.size() == 0) {
			return "not qualified to teach courses yet.";
		} else {
			return courses.toString();
		}
	}
	
	/**
	 * Add the course which the instructor can teach
	 * @param course
	 */
	public void addCourseToInstructorAbilities(String course) {
		if(!courses.contains(course))
			courses.add(course);
	}
	
	/**
	 * Is the instructor can teach this course
	 * @param course
	 * @return
	 */
	public Boolean instructorCanTeach(String course) {
		return courses.contains(course);
	}
	
	/**
	 * Override toString method
	 * Return string which combine instructor first name and last name
	 */
	@Override
	public String toString() {
		return getFirstName() + " " + getLastName();
	}
}
