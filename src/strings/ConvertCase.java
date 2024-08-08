package strings;

public class ConvertCase {

	public static void main(String[] args) {
		String str="HELLO world";
		
		String lower="";
		
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)>=65&&str.charAt(i)<=90)
			{
				System.out.print((char)(str.charAt(i)+32));
			}
			else if(str.charAt(i)>=97&&str.charAt(i)<=122)
			{
				System.out.print((char)(str.charAt(i)-32));
			}
			else
			{
				System.out.print(str.charAt(i));
			}


		}
	}

}
