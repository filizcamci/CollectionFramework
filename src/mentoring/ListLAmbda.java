package mentoring;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface MyInter<X>{
	X myMethod(X x);
}
public class ListLAmbda {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
		for(Integer num : numbers) {
			//System.out.println(num);
		}
		
		numbers.forEach(   num -> { 
			if(num ==3){ System.out.println("three");}
			else {
			System.out.println(num);}}   );

		List<String> names = Arrays.asList("Vaso", "Vika", "Akbar","Sonia");
		names.forEach(  
				name -> { 
			if(name.contains("A")){ System.out.println("Teacher");}
			else if(name.endsWith("o")) {System.out.println("Good ");}
			else {
			System.out.println(name);}}   );
	
	
	Predicate<String> pre1 = name -> name.startsWith("S"); 
	
	names.forEach( (
			String name) -> {
		if(pre1.test(name)) {
			System.out.println("Starts with S: " +name);  }  }  );
}

}
