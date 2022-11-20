package week3.day1homeassignments4student;

public class Student {

	public void getStudentInfo(int id)
	{
		id=5;
		System.out.println(id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		id=10;
		name="Asma";
		System.out.println(id);
		System.out.println(name);
	}
	
	public void getStudentIfo(String email,String phonenumber)
	{
		email="asmunazeer@gmail.com";
		phonenumber="9698620194";
		System.out.println(email);
		System.out.println(phonenumber);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student=new Student();
		
		student.getStudentIfo(null, null);
		student.getStudentInfo(0);
		student.getStudentInfo(0, null);
	}

}
