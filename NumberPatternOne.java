package stringsExamples;

public class NumberPatternOne {

	public static void main(String[] args) {
	
		int c=2;
		for(int i=0; i<=4;i++) {
			for(int j=0;j<=i;j++) {
					 
				System.out.print(c+" ");
				  c=c+2;                     //i=0 then c=2
			                                  //i=1 then c=4+1, 5+2 and i=2 then 
			}
			System.out.println();
			c++;
		}

	}

}
