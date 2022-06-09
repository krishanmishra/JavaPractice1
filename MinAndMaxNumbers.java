package stringsExamples;

public class MinAndMaxNumbers {
	
	
	public void findMaxNumber(int a,int b,int c) {
		int max=0;
		while(a>0||b>0||c>0) {
			a--;
			b--;
			c--;
			max++;
		}
		System.out.println(max);
	}
	
	public void findMinNumber(int a,int b,int c) {
		int min=0;
		while(a>0 && b>0 && c>0) {
			a--;
			b--;
			c--;
			min++;
		}
		System.out.println(min);
	}

		
		public static void main(String[] args) {
		 MinAndMaxNumbers max=new  MinAndMaxNumbers();
//		 max.findMaxNumber(10,70,90);
//		 max.findMaxNumber(0,0,0);
//		 max.findMaxNumber(10,0,90);
//		 max.findMaxNumber(800,0,1);
//		 max.findMaxNumber(700,70,90);
		 
		 max.findMinNumber(10,5, 7);
		 max.findMinNumber(10,5, 7);
		 max.findMinNumber(0,0,0);
		 max.findMinNumber(0,5, 7);
		
		
	}

}
