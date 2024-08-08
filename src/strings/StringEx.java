package strings;

public class StringEx {

	public static void main(String[] args) {
		
		String str="Hello";
		
		str=str.concat(" Java");
		System.out.println(str);
		
		
		String str1=new String("Hello");
		
		System.out.println(str==str1);// checks with object address(==)
		
		System.out.println(str.equals(str1));// checks with actual String
		
		String str2="Hello";
		
		System.out.println(str==str2);
		
		
		
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i));
			
		}

		

	}

}
