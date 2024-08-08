package strings;

public class MutableString {

	public static void main(String[] args) {
		StringBuffer buf=new StringBuffer("Hello");
		
		buf.append(" World");
		System.out.println(buf);
		
		StringBuilder builder=new StringBuilder("Java");
		
		builder.append(" Programming");
		
		System.out.println(builder);
		
		String str=new String("veda");
		
		str=str.intern();
		
		String str1="Veda";
		System.out.println(str==str1);

	}

}
