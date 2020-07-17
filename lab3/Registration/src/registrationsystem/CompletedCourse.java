/**
 * CompletedCourse class
 * 
 * 
 * @author Yu-Hsuan Huang
 * Student#: 200443723
 * Date: 2020/07/08
 */
package registrationsystem;

public class CompletedCourse {
	
	private Course course;
	private Integer grade;
	
	//Constructors
	public CompletedCourse() {}
	
	public CompletedCourse(Course course, Integer grade) {
		super();
		this.course = course;
		this.grade = grade;
	}
	
	//Getters and setters
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	
	@Override
	public String toString() {
		return course.getCourseCode() + "-" + course.getCourseTitle() + " grade=" + grade;
	}
}
