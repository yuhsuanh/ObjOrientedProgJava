/**
 * Course class
 * 
 * 
 * @author Yu-Hsuan Huang
 * Student#: 200443723
 * Date: 2020/07/08
 */
package registrationsystem;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private Instructor instructorToTeach;
	private String courseCode;
	private String courseTitle;
	private String classRoom;
	private DayOfWeek dayOfWeek;
	private LocalTime time;
	private Integer hours;
	private Integer classSize;
	private String prerequisiteCourse;
	
	List<Student> students;
	
	//Constructors
	public Course() {}
	
	public Course(Instructor instructorToTeach, String courseCode, String courseTitle, String classRoom, DayOfWeek dayOfWeek,
			LocalTime time, Integer hours) throws IllegalArgumentException {
		
		//Make sure the instructor can teach this course
		if(!instructorToTeach.instructorCanTeach(courseCode))
			throw new IllegalArgumentException("Professor " + instructorToTeach + " is not qualified to teach " + courseCode);
		//Make sure the course time should between 8:00 and 18:00
		if(time.isBefore(LocalTime.parse("08:00")) || time.isAfter(LocalTime.parse("18:00")))
			throw new IllegalArgumentException("Course start time must be between 08:00-18:00");
		
		this.instructorToTeach = instructorToTeach;
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.classRoom = classRoom;
		this.dayOfWeek = dayOfWeek;
		this.time = time;	
		this.hours = hours;
		this.prerequisiteCourse = "";
		
		this.classSize = 3;
		students = new ArrayList<Student>();
	}
	
	public Course(Instructor instructorToTeach, String courseCode, String courseTitle, String classRoom, DayOfWeek dayOfWeek,
			LocalTime time, Integer hours, String prerequisiteCourse) throws IllegalArgumentException {
		
		//Make sure the instructor can teach this course
		if(!instructorToTeach.instructorCanTeach(courseCode))
			throw new IllegalArgumentException("Professor " + instructorToTeach + " is not qualified to teach " + courseCode);
		//Make sure the course time should between 8:00 and 18:00
		if(time.isBefore(LocalTime.parse("08:00")) || time.isAfter(LocalTime.parse("18:00"))) 
			throw new IllegalArgumentException("Course start time must be between 08:00-18:00");
		
		this.instructorToTeach = instructorToTeach;
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.classRoom = classRoom;
		this.dayOfWeek = dayOfWeek;
		this.time = time;	
		this.hours = hours;
		this.prerequisiteCourse = prerequisiteCourse;

		this.classSize = 3;
		students = new ArrayList<Student>();
	}
	
	//Getters and setters
	public Instructor getInstructorToTeach() {
		return instructorToTeach;
	}
	public void setInstructorToTeach(Instructor instructorToTeach) {
		this.instructorToTeach = instructorToTeach;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Integer getClassSize() {
		return classSize;
	}
	/**
	 * The class size maximum is 40. if class size over 40, it will directly replace 40.
	 * @param classSize
	 * @return
	 */
	public String setClassSize(Integer classSize) {
		if(classSize > 40) {
			this.classSize = 40;
			return "Max class size = 40, it has been set to 40";
		} else {
			this.classSize = classSize;
			return "";
		}
	}
	
	
	
	/**
	 * Get course day of week and time
	 * @return
	 */
	public String getCourseDayAndTime() {
		return getDayOfWeek().toString() + "'s, starting at " + getTime();
	}
	
	/**
	 * Add the student to this course
	 * It need to make sure the student is good standing 
	 * 	And amount of student should lower class size
	 *  And student should pass the prerequisite course. 
	 * @param student
	 * @return
	 */
	public String addStudent(Student student) {
		if(!student.studentInGoodStanding()) {
			return "The Student is not in good standing and cannot join the course.";
		} else if (students.size() == getClassSize()) {
			return "Student was not added because the course is full";
		} 
		else if(!checkPrerequisite().isEmpty()) {
			if(!student.hasCompleted(checkPrerequisite())) {
				return "Student has not completed the prerequisite course: " + checkPrerequisite();
			}
		}
		students.add(student);
		return "";
	}
	
	/**
	 * Get the students who take this course
	 * @return
	 */
	public String displayTheClassList() {
		return students.toString().substring(1, students.toString().length()-1);
	}
	
	/**
	 * If students average age over 25, the method will return true; Otherwise return false
	 * @return
	 */
	public boolean matureClass() {
		int sum = 0;
		int avg = 0;
		for(Student student : students) {
			sum += student.getStudentAge();
		}
		avg = sum/students.size();
		if(avg > 25) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Get prerequisite course
	 * @return
	 */
	public String checkPrerequisite() {
		return prerequisiteCourse;
	}

	/**
	 * Override toString method
	 * Return string which combines course code and course title
	 */
	@Override
	public String toString() {
		return getCourseCode() + "-" + getCourseTitle();
	}
}
