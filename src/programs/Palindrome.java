package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n value:");
		int num=sc.nextInt();
		int real=num;
		int temp=0;
		int rem=0,rev = 0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		//for(;num>0;num/=10)
		//{
		//		rem=num%10;
		//		rev=rev*10+rem;
		//}
		System.out.println("Rev Number: "+rev);
		if(rev==real)
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
