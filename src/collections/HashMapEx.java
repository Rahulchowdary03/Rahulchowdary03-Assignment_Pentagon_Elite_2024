package collections;

import java.util.HashSet;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashSet<String> hash=new HashSet<>();
		HashSet<Integer> hash1=new HashSet<>();
		hash.add("Rahul");
		hash1.add(23);
		hash1.add(12);
		System.out.println(hash.hashCode());
		System.out.println(hash1.hashCode());

		Object obj =new Object();
		System.out.println(obj.hashCode());
	}

}
