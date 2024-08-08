package basics;

public class NestedWhile {

	public static void main(String[] args) {
int n=5;
		
		int i=1;
		while(i<=n)
		{
		
			System.out.println("Outer : "+i);
			
			int j=1;
			
			while(j<=3)
			{
				System.out.println("Inner : "+j);
				j++;
			}
			i++;
			
		}

	


	}

}
