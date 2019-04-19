package sj;

public class Student {
	
	String name;
	int rollno;
	String course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", course=" + course + "]";
	}

	public Student(String name, int rollno, String course) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.course = course;
	}

}
