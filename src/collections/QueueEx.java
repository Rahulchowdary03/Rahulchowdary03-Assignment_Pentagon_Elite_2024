package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Integer> que=new ArrayDeque<>();
		que.add(23);
		que.add(45);
		que.add(90);
		que.add(67);
		System.out.println(que);
		System.out.println(que.remove());
		que.add(44);
		System.out.println(que);

	}

}
