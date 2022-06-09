package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;


	
	class MyComparator implements Comparator<String>{

		public int compare(String s1, String s2) {
		
			return s1.length()-s2.length();
		}		
		
	}
	
	public class PriorityQueueStringLength {

	public static void main(String[] args) {
		MyComparator campartor=new MyComparator();
		PriorityQueue<String> pr=new PriorityQueue<>(10,campartor);
		
		pr.add("naveen");
		pr.add("krishan");
		pr.add("jatin");
		pr.add("krishan mishra");
		pr.add("K");
		pr.add("kr");
		
		System.out.println(pr.poll());
		
	}

}
