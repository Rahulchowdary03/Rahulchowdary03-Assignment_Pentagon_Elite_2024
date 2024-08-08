package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * If the superclass method declares an exception, 
 * subclass overridden method can declare same, 
 * subclass exception or no exception 
 * but cannot declare parent exception.

 */

class Parent
{
	void print() throws IOException
	{
		System.out.println("Parent Exception");
	}
}
class Child extends Parent
{
	@Override
	void print()
	{
		System.out.println("Child exception");
	}
}

public class ExceptionWithMethodOveriding {

	public static void main(String[] args) {
		


	}

}
