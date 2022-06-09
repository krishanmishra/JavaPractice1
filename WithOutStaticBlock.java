package JavaFeatures;

public class WithOutStaticBlock {
	
//	public static int printString() {
//		System.out.println("Hello World");
//		return 1;
//	}
//
//	static int p=printString();
	
	public static boolean printString() {
		System.out.println("Hello World");
		return true;
	}

	static boolean p=printString();
	
	public static void main(String[] args) {
		

	}

}
