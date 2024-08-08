package collections;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("Tony Starc");
		names.add("Peter Parker");
		names.add("Harry Potter");
		names.add("Jack Sparrow");
		names.add("Virat Kohli");
		names.add("M S Dhoni");
		
		System.out.println(names);
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		for(String n:names) {
			System.out.println(n);
		}

	}

}
