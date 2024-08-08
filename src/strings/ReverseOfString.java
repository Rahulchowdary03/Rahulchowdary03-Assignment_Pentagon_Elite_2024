package strings;

public class ReverseOfString {

	public static void main(String[] args) {
		
		String str="madam";
		
		String reverse="";
		
		for (int i = str.length()-1; i >=0; i--) {
			
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println(reverse);
		

	}

}
