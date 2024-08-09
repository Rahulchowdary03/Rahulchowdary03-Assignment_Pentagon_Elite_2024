package programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3=0;
		int count=0;
		while(count<10)
		{
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
			count++;
		}

	}

}

 