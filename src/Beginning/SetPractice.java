package Beginning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//set has only unique elements
public class SetPractice {
//iterator can not go back. if we need to iterate again we need to create a new iterator
	//or we can reuse it as setIter = numSets.iterator();
	public static void main(String[] args) {
		Set<Integer> numSets=new HashSet<>();
		//HashSet<Integer> numSets=new HashSet<>();
		numSets.add(123);
		numSets.add(123);
		numSets.add(12);
		numSets.add(13);
		numSets.add(53);
		numSets.add(13);
		//numSets.get(0); //does not compile since set is not ordered
//		for(Integer each:numSets) {
//			System.out.println(each);
//		}
		Iterator<Integer> setIter = numSets.iterator();
		System.out.println("================iterator with while loop==================");
		  while (setIter.hasNext() ) {
		      System.out.print( setIter.next()+",");
		  }
		      
		//Iterator<Integer> setIter = numSets.iterator();
		  System.out.println();
		  System.out.println("=============after removing even numbers=========");
		while(setIter.hasNext()) {
			Integer i=setIter.next();
			//if(i%2==0) {
			if(setIter.next() >100)
				setIter.remove();
//			if(i>100) {
//				setIter.remove();
//			}
			//System.out.println(i+" is deleted");
		}
		System.out.println(numSets);
		//System.out.println(setIter); //if we try to print out iterator we got hashcode
		
		//iterator with for loop
		System.out.println("================iterator with for loop==================");
		//setIter = numSets.iterator(); //or we can use this one in the for loop
		for(Iterator<Integer> setIter2 = numSets.iterator();setIter2.hasNext();) {
			System.out.println(setIter2.next());
		}

	}
	//Charles's code
	/*
	 * public static void main(String[] args) {
	
		Set<Integer> numSets = new HashSet<Integer>();
		
		numSets.add(15);
		numSets.add(464);
		numSets.add(44);
		numSets.add(854);
		numSets.add(6454);
		numSets.add(34);
		
		for ( Integer each : numSets) {
			System.out.println(each);
		}
		
		Iterator<Integer> setIter = numSets.iterator();
		
		
		while(setIter.hasNext()) {
			if(setIter.next() >100)
				setIter.remove();
		}
		
		
		System.out.println(numSets);
		

	}
	 */


}
