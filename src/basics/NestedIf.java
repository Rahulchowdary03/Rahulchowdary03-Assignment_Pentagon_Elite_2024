package basics;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the product");
		String product=sc.nextLine();
		
		if(product.equals("Mobile"))
		{
			System.out.println("Enter Brand to check availability");
			
			String brand=sc.nextLine();
			if(brand.equals("Nokia"))
			{
				System.out.println("Available, Ready to purchase");
			}
			else
			{
				System.out.println("Not available");
			}
		}
		else
		{
			System.out.println("Product is not available");
		}


	}

}
