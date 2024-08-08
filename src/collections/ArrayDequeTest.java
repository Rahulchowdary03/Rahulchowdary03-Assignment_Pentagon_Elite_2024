package collections;

import java.util.ArrayDeque;

public class ArrayDequeTest {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> aq=new ArrayDeque<>();
		
		aq.add(12);
		aq.add(23);
		aq.add(4);
		aq.add(56);
		aq.add(43);
		System.out.println(aq);
		aq.addFirst(11);
		System.out.println(aq);
		aq.addLast(66);
		System.out.println(aq);
		aq.offerFirst(32);
		System.out.println(aq); 

	}

}
