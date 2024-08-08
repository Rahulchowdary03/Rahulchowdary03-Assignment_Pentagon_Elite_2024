package abstraction;




abstract class Operation
{
	abstract int calculate(int a,int b);
	
	
	void msg()
	{
		System.out.println("Welcome to arithmatic operation");
	}
}
class Addition extends Operation
{

	@Override
	int calculate(int a, int b) {
		
		return a+b;
	}
	
}

class Subtraction extends Operation
{
	@Override
	int calculate(int a,int b)
	{
		return a-b;
	}
}
class Multiplication extends Operation
{

	@Override
	int calculate(int a, int b) {
		
		return a*b;
	}
	
}

public class AbstractTest {
	
	public static void main(String[] args) {
		
		
		Addition add=new Addition();
		add.msg();
		System.out.println(add.calculate(12, 45));
		
		Subtraction sub=new Subtraction();
		sub.calculate(34, 56);
		
		
		Multiplication mul=new Multiplication();
		mul.calculate(4, 6);		
	}

}


