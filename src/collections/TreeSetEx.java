package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<Integer>ts=new TreeSet<Integer>();
		
		ts.add(10);
		ts.add(12);
		ts.add(45);
		ts.add(34);
		ts.add(56);
		ts.add(22);
		System.out.println(ts);
		
//		ts.add(null);
//		ts.removeAll(ts);
//		System.out.println(ts);
		
		System.out.println("returns least greater or equal "+ts.ceiling(22));

		System.out.println("returns least lesser or equal "+ts.floor(11));
		
		
		Iterator<Integer> itr=ts.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
