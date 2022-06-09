package Collections;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	
	public static void main(String []args) {
		
		///always maintaining ascending order and least value First
		
		PriorityQueue<Integer> pr=new PriorityQueue<Integer>();
		
		pr.add(750);
		pr.add(150);
		pr.add(20);
		pr.add(50);
		pr.add(73450);
		System.out.println(pr.size());
		
		//Poll -head of the priority remove first (least value first)
		System.out.println(pr.poll()+ "Peek "+pr.peek());
		
	}

}
