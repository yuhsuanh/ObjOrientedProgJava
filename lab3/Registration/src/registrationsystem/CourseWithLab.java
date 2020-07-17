/**
 * CourseWithLab class
 * 
 * 
 * @author Yu-Hsuan Huang
 * Student#: 200443723
 * Date: 2020/07/08
 */
package registrationsystem;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class CourseWithLab {
	
	Instructor instructorToTeach;
	String courseCode;
	String courseTitle;
	String classRoom;
	DayOfWeek dayOfWeek;
	LocalTime time;
	Integer hours;
	String prerequisiteCourse;
	
	Instructor instructorToLab;
	String classRoomForLab;
	DayOfWeek dayOfWeekForLab;
	LocalTime timeForLab;
	
	//Constructor
	public CourseWithLab() {}

	public CourseWithLab(Instructor instructorToTeach, String courseCode, String courseTitle, String classRoom,
			DayOfWeek dayOfWeek, LocalTime time, Integer hours, Instructor instructorToLab, String classRoomForLab,
			DayOfWeek dayOfWeekForLab, LocalTime timeForLab) throws IllegalArgumentException {
		
		//Make sure the instructor can teach this course
		if(!instructorToTeach.instructorCanTeach(courseCode))
			throw new IllegalArgumentException("Professor " + instructorToTeach + " is not qualified to teach " + courseCode);
		//Make sure the course time should between 8:00 and 18:00
		if(time.isBefore(LocalTime.parse("08:00")) || time.isAfter(LocalTime.parse("18:00")))
			throw new IllegalArgumentException("Course start time must be between 08:00-18:00");
		//Make sure the instructor can teach this lab
		if(!instructorToLab.instructorCanTeach(courseCode + "-LAB"))
			throw new IllegalArgumentException("The Lab Tech is not qualified to host the lab");
		//Make sure the lab time should between 8:00 and 18:00
		if(timeForLab.isBefore(LocalTime.parse("08:00")) || timeForLab.isAfter(LocalTime.parse("18:00")))
			throw new IllegalArgumentException("Course start time must be between 08:00-18:00");
		
		this.instructorToTeach = instructorToTeach;
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.classRoom = classRoom;
		this.dayOfWeek = dayOfWeek;
		this.time = time;
		this.hours = hours;
		this.instructorToLab = instructorToLab;
		this.classRoomForLab = classRoomForLab;
		this.dayOfWeekForLab = dayOfWeekForLab;
		this.timeForLab = timeForLab;
	}
	
	public CourseWithLab(Instructor instructorToTeach, String courseCode, String courseTitle, String classRoom,
			DayOfWeek dayOfWeek, LocalTime time, Integer hours, String prerequisiteCourse, Instructor instructorToLab, String classRoomForLab,
			DayOfWeek dayOfWeekForLab, LocalTime timeForLab) throws IllegalArgumentException {
		
		//Make sure the instructor can teach this course
		if(!instructorToTeach.instructorCanTeach(courseCode))
			throw new IllegalArgumentException("Professor " + instructorToTeach + " is not qualified to teach " + courseCode);
		//Make sure the course time should between 8:00 and 18:00
		if(time.isBefore(LocalTime.parse("08:00")) || time.isAfter(LocalTime.parse("18:00")))
			throw new IllegalArgumentException("Course start time must be between 08:00-18:00");
		//Make sure the instructor can teach this lab
		if(!instructorToLab.instructorCanTeach(courseCode + "-LAB"))
			throw new IllegalArgumentException("The Lab Tech is not qualified to host the lab");
		//Make sure the lab time should between 8:00 and 18:00
		if(timeForLab.isBefore(LocalTime.parse("08:00")) || timeForLab.isAfter(LocalTime.parse("18:00")))
			throw new IllegalArgumentException("Course start time must be between 08:00-18:00");
		
		this.instructorToTeach = instructorToTeach;
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.classRoom = classRoom;
		this.dayOfWeek = dayOfWeek;
		this.time = time;
		this.hours = hours;
		this.prerequisiteCourse = prerequisiteCourse;
		this.instructorToLab = instructorToLab;
		this.classRoomForLab = classRoomForLab;
		this.dayOfWeekForLab = dayOfWeekForLab;
		this.timeForLab = timeForLab;
	}
	
	//Getters and Setters
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
	public Instructor getInstructorToLab() {
		return instructorToLab;
	}
	public void setInstructorToLab(Instructor instructorToLab) {
		this.instructorToLab = instructorToLab;
	}
	public String getClassRoomForLab() {
		return classRoomForLab;
	}
	public void setClassRoomForLab(String classRoomForLab) {
		this.classRoomForLab = classRoomForLab;
	}
	public DayOfWeek getDayOfWeekForLab() {
		return dayOfWeekForLab;
	}
	public void setDayOfWeekForLab(DayOfWeek dayOfWeekForLab) {
		this.dayOfWeekForLab = dayOfWeekForLab;
	}
	public LocalTime getTimeForLab() {
		return timeForLab;
	}
	public void setTimeForLab(LocalTime timeForLab) {
		this.timeForLab = timeForLab;
	}
	
	
	
	/**
	 * Get lab day of week and time
	 * @return
	 */
	public String getLabClassAndTime() {
		return "room: " + getClassRoomForLab() + ", " + getDayOfWeekForLab() + " starting at " + getTimeForLab();
	}
	
	/**
	 * Get instructor who teach lab
	 * @return
	 */
	public Instructor getLabTech() {
		return instructorToLab;
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
	 * Return string which combines course code, course title and with lab message
	 */
	@Override
	public String toString() {
		return getCourseCode() + "-" + getCourseTitle() + " with lab";
	}

}
