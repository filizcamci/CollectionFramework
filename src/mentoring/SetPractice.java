package mentoring;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
	public static void main(String[] args) {

		Set<Integer> numSets = new HashSet<>();
		// IMPORTANT
		// Set is a collection of unique elements
		// it ignores duplicated elements
		// Set does not keep order; therefore, there is no indices!!!
		// regular for loop does not work here since there are no indexes 
		
		numSets.add(122); numSets.add(177); numSets.add(49); numSets.add(122);  numSets.add(72); numSets.add(49); numSets.add(122); 
		System.out.println(numSets); 	
		
		LinkedHashSet<Integer> numSetsL = new LinkedHashSet<>();
		numSetsL.add(247); numSetsL.add(200); numSetsL.add(247); numSetsL.add(312); numSetsL.add(121); numSetsL.add(247); numSetsL.add(290); 
		System.out.println(numSetsL);
		
		Set<Integer> numSett = new TreeSet<>(numSets);
		System.out.println(numSett);
		
		Set<Integer> numnum = new TreeSet<>(numSetsL);
		System.out.println(numnum);
		
		
		
//		for (Integer each : numSets) {	
//			System.out.println(each +" ");
//		}
	
		Iterator<Integer> setIter = numSets.iterator();
		 
		
	//	System.out.println( setIter.hasNext() );
	//	System.out.println( setIter.next() );
	//	System.out.println( setIter.next() );
		
//		while (setIter.hasNext() ) {
//			
//			Integer i = setIter.next() ;
////			if (i < 100 ) {
////				setIter.remove();
////				System.out.println("Deleted " + i);
////		}
//			System.out.println(numSets);
//		}
	
	
	
	
	}

}
