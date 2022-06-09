package JavaFeatures;

import java.util.Optional;
import java.util.stream.Stream;



public class StreamConcept {

	public static void main(String[] args) {

      Stream.of(1,2,3,4,5,6,7,8,9).filter(e->e%2==0).forEach(e->System.out.println(e)); //JSK 8
      
     
      Stream.of("hello","java")
            .map(e -> e + "world")
            .forEach(System.out::println);
      
      //optional ,JDK 8
      String s[]=new String[5];
//      System.out.println(s[2].length()); Exception null pointer exception
      s[2]="naveen";
      Optional<String> isNull=Optional.ofNullable(s[2]);
      if(isNull.isPresent()) {
    	  System.out.println(s[2]+" "+s[2].length());
      }else {
    	  System.out.println("value is not available");
      }
      
      isNull.ifPresent(e -> System.out.println(e.length()));
      
      Optional<String> nothing=Optional.empty();
      nothing.ifPresent(e ->System.out.println("Bye..."));
      
      //JShell: JDK 9, Factory method for immutable collection
      
      
      
      
      

	}

}
