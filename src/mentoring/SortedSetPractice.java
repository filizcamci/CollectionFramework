package mentoring;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {

	public static void main(String[] args) {
		
		SortedSet<Integer> sSet = new TreeSet<>();
//		TreeSet<Integer> sSket = new TreeSet<>();
		
		sSet.add(123) ; sSet.add(113) ; sSet.add(334) ; sSet.add(3) ; sSet.add(3) ;  
		System.out.println(sSet);
		
		System.out.println( sSet.tailSet(120)); // returns a set of all elements greater than the parameter 
		System.out.println( sSet.headSet(78));  // returns a set of all elements smaller than the parameter 
		System.out.println( sSet.subSet(100, 148)); // returns a set of all elements between the two parameters
		
		SortedSet<String> stSet = new TreeSet<>();
		
		stSet.add("kana"); stSet.add("jana"); stSet.add("dana"); stSet.add("ghana"); stSet.add("xana"); stSet.add("daana");
		stSet.add("Ghana"); stSet.add("Kana"); stSet.add("KAna"); stSet.add("KanA");
		
		System.out.println( stSet );
		System.out.println( stSet.headSet("g") );
		System.out.println( stSet.tailSet("K") );
		System.out.println( stSet.tailSet("k") );
		
		//System.out.println( stSet.subSet("d" , "") ); //throws IllegalArgumentException
		System.out.println( stSet.subSet("" , "f") );
		
		TreeSet<String> kk = new TreeSet<>(stSet.tailSet("k"));
		SortedSet<String> kkk = stSet.tailSet("k");
		System.out.println(kk);
		System.out.println(kkk);
		
		
	}

}
