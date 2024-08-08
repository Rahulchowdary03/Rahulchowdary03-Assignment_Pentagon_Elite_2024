package polymorphism;

class Addition
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition Of Two Numbers : "+c);
	}
	void add(int a,float b)
	{
		int c=(int)(a+b);
		System.out.println("Addition Of Two Numbers with Same paramter and different datatype : "+c);
	}
	void add(int a,int b,int c)
	{
		int res=a+b+c;
		System.out.println("Addition of 3 Numbers:POV with three parameter: "+res);
		
	}
}
public class CompileTime {
	public static void main(String[] args) {
		
		Addition ad=new Addition();
		ad.add(12, 13);
		ad.add(23, 45, 56);
		ad.add(13, 34.45f);
	}

}

