package collections;

import java.util.PriorityQueue;

public class PriQueue {

	public static void main(String[] args) {
		
		PriorityQueue <Integer> pq=new PriorityQueue <Integer>();
		
		pq.add(45);
		pq.add(32);
		pq.add(67);
		pq.add(11);
		pq.add(1);
	
		
		
			
		System.out.println(pq);
		System.out.println(pq.peek());//to display high priority element
		
  	   	System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		pq.offer(22);
		System.out.println(pq);
	}

}
