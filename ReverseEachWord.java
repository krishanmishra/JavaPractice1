package stringsExamples;

public class ReverseEachWord {

	public static String reverseWord(String word) {

		//String str[] = word.split("\\s");
		String reverseWord="";
		char str[]=word.toCharArray();
		
//		for(String s:str) {
//			StringBuffer sb=new StringBuffer(s);
//			sb.reverse();
//			reverseWord=reverseWord+sb +" ";
//		}
		
//		for(char s:str) {
		for(int i=str.length-1;i>=0;i--) {
			
//			for(int i=s.length()-1;i>=0;i--) {
				//char a[]=s.toCharArray();			
				reverseWord=reverseWord+str[i];				
			}
			
	
		return reverseWord;

	}

	public static void main(String[] args) {
		
		 System.out.println(ReverseEachWord.reverseWord("my name is krishan"));  
	}

}
