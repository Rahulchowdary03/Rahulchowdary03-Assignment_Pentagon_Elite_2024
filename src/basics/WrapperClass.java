package basics;

public class WrapperClass {

	public static void main(String[] args) {
		
		int a=40;
		 Integer b=60;
		 Integer c=new Integer(50);
		 
		 int num1=100;
		 //Autoboxing->primitive to wrapper
		 
		 Integer num2=num1;
		 
		 Integer num3=Integer.valueOf(num1);
		 //Unboxing ->wrapper to primitive
		 
		 Integer num4=1000;
		 int num5=num4;
		 
		 //explicit;y converting from wrapper to primitive
		 int num6=num4.intValue();

	}

}
