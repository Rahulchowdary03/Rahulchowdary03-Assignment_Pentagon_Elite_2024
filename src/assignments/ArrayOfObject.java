package assignments;

class Employee
{
	int eid;
	String ename;
	double salary;
	String designation;
	public Employee(int eid, String ename, double salary, String designation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
	}
	void getEmpDetails()
	{
		
	}
}

public class ArrayOfObject {
	
	

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"Rahul",66000,"Developer");
		
		Employee e2=new Employee(2,"Jackie",76000,"Archeologist");
		
		Employee e3=new Employee(3,"Ben",56000,"Trainee");
		
		Employee e4=new Employee(4,"Gwen",60000,"Tester");
		
		Employee e5=new Employee(5,"Sindbad",45000,"Sailor");
		
		Employee[] emparr= {e1,e2,e3,e4,e5};
		
		for(Employee emp:emparr)
		{
			if(emp.salary>=50000)
			{
				
			}
		}
	}
	
	
	
}

