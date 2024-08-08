package collections;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		
		Watches w1=new Watches("Bolt","Android",1999,"men");
		
		Watches w2=new Watches("Rolex","Analog",200000,"men");
		
		
		Watches w3=new Watches("Noise","Android",2999,"women");
		
		Watches w4=new Watches("Apple","IOS",19999,"men");
		
		
		LinkedList<Watches> watchlist=new LinkedList<Watches>();
		
		Collections.addAll(watchlist,w1,w2,w3,w4);
		
		System.out.println("Men Collection");
		for(Watches w:watchlist) {
			if(w.category.equals("men"))
			{
				
				System.out.println(w);
			}
		}
			

}
}