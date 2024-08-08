package exception;

public class FinallyBlock {

	public static void main(String[] args) {
		
try {
			
			int a=4/0;
			
		}

		finally {
			
			System.out.println("Important statement is "
					+ "getting executed");
		}


	}

}
