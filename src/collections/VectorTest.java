package collections;
import java.util.*;
import java.util.Vector;


public class VectorTest {

	public static void main(String[] args) {
		
		Vector<Integer>v1=new Vector<>();
		
		v1.addElement(45);
		v1.add(24);
		v1.addElement(56);
		
		System.out.println(v1);
		
		v1.removeElementAt(1);
		
		System.out.println(v1);
		
		ArrayList<Integer>a=new ArrayList<>();
		
		Collections.addAll(a, 21,34,76);

		System.out.println(a);
		
		Iterator<Integer>itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
