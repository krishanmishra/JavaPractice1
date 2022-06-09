package JavaFeatures;

public class ObbjectClass {

	public static void main(String[] args) {
		ObbjectClass obj=new ObbjectClass();
		System.out.println((obj.getClass().getSuperclass()));
		
		Class cls=obj.getClass().getSuperclass();
		System.out.println(cls);
	}

}
