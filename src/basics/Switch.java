package basics;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the option");
		System.out.println("1. Addition\n"
				+ "2. Subtraction\n"
				+ "3. Multiplication\n"
				+ "4. Division\n");
		int option=sc.nextInt();
		int a=20,b=30;
		int res;
		switch(option)
		{
		case 1: res=a+b;
		System.out.println("Addition of 2 numbers "+res);
		break;
			
		case 2: res=a-b;
		System.out.println("Subtraction of 2 numbers "+res);
		break;
			
		case 3: res=a*b;
		System.out.println("Multiplication of 2 numbers "+res);
		break;
			
		case 4: res=a/b;
		System.out.println("Division of 2 numbers "+res);
		break;
		
		default : System.out.println("Invalid Option");
			
		}


	}

}
