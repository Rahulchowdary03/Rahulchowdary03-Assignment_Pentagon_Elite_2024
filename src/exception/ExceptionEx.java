package exception;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("Starting ");

		try {
			int n=40/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		int a[]= {35,56,12,45};
		
		try {
		System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}

		System.out.println("Ending");


	}

}
