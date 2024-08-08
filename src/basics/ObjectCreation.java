package basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Demo
{
	String name="Rahul";
}

public class ObjectCreation {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		//1.using new keyword
		
		Demo d=new Demo();
		System.out.println(d);
		
		
		
		//2.using class.newInstance()

		Demo d1=Demo.class.newInstance();
		System.out.println(d);
		
		//3.using clone()
		  
		ObjectCreation obj=new ObjectCreation();
		ObjectCreation obj1=(ObjectCreation) obj.clone();
		System.out.println(obj1);
		
		//4.newInstance() method of Constructor
		
		Constructor<ObjectCreation> ob= ObjectCreation.class.getConstructor();
		
		ObjectCreation ob1=ob.newInstance();
		
		System.out.println(ob1);
	}

}
