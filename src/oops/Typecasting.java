package oops;

class Parent
{
	void printData()
	{
		System.out.println("calling parent class method");
	}
}
class Child extends Parent
{
	void printData()
	{
		System.out.println("Calling child class method");
	}
	void display()
	{
		System.out.println("Child property");
	}
}
public class Typecasting {

	public static void main(String[] args) {
		
		Parent p=new Child();
		p.printData();
		
		Child c=(Child)p;
		c.display();
		c.printData();

	}

}
