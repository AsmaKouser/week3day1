package week3.day1homeassignment2org.student;

import week3.day1homeassignments2org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Asma");
	}
	public void studentDept()
	{
		System.out.println("IT");
	}
	public void studentId()
	{
		System.out.println("1234");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student=new Student ();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentId();
		student.studentName();
		student.studentDept();
		
		
		
		
	}

}
