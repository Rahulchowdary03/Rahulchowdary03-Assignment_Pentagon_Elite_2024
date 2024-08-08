package exception;

public class NestedTry {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {

		int a=4/0;
			try
			{
				int arr[]=new int[3];
				System.out.println(arr[5]);
				
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();		
		}
		System.out.println("World");


	}

}
