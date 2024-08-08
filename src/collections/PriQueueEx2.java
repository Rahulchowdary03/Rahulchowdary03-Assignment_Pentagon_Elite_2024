package collections;

import java.util.PriorityQueue;

public class PriQueueEx2 {

	public static void main(String[] args) {
		
		PriorityQueue<String> places=new PriorityQueue<>();
		
		places.add("Ooty");
		places.add("Pondicherry");
		places.add("Nandi Hills");
		places.add("Tirupati");
		
		System.out.println(places);
		System.out.println("Removing......");
		System.out.println(places.poll());

		System.out.println(places.poll());
		System.out.println(places.poll());
		System.out.println(places.poll());
	}

}
