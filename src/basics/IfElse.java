package basics;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		

	

	Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Branch");
			String branch=sc.next();
			
			if(branch.equals("CSE"))
			{
				System.out.println("Can be a Developer");
			}
			else if(branch.equals("Mech"))
			{
				System.out.println("Can be a Mechanical Engineer ");
			}
			
			else if(branch.equals("Civil"))
			{
				System.out.println("Can be a Civil Engineer ");
			}
	
	}
}
