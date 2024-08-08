package polymorphism;

class Student
{
	int sid;
	String name;
	int age;
	int marks;
	char grade;
	
	void setDetails(int sid)
	{
		this.sid=sid;
	}
	void setDetails(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	void setDetails(int marks,char grade)
	{
		this.marks=marks;
		this.grade=grade;
		
	}
	
	void disp()
	{
		System.out.println("Student Id "+sid);
		System.out.println("Student Name "+name);
		System.out.println("Student Age "+age);
		System.out.println("Student Marks "+marks);
		System.out.println("Grade : "+grade);
	}
	
	
}
public class StaticPoly {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setDetails(12);
		s.setDetails(500, 'A');
		s.setDetails(23,"Dhoni");
		s.disp();
		

	}

}

