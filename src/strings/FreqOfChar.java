package strings;

import java.util.Scanner;

public class FreqOfChar {

	public static void main(String[] args) {
		String str="Vikrant Rona";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter char to check frequency");
		
		char ch=sc.next().charAt(0);
		
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)==ch)
			{
				count++;
			}
			
		}
		
		System.out.println(ch+"  occurs "+count+" times");


	}

}
