package Beginning;
import java.util.*;
/*
 * Create a list of prices (Long) 
 * with few duplicate elements 
 * 
 * Task 1.1
 * Generate only unique prices by taking out duplicate
 * 1,2,3,3,22,1, ---- > 1,2,3,22
 * 
 * Task 1.2 
 * Generate ordered collection out of the list 
 * 1,4,3,2,22,100, ---- > 1,2,3,4,22,100
 * 
 * Task 1.3 
 * retrieve the items from 5 - 9 
 * assuming you have 5 and 9 in the list 
 *  1,2,5,8,6,9, 22,100 ---> 5,6,8,9
 * 
 * */


public class MapDay {

	public static void main(String[] args) {
		List<Long> prices=new ArrayList();
		prices.add(11L);
		prices.add(24L);
		prices.add(36L);
		prices.add(9L);
		prices.add(65L);
		prices.add(5L);
		prices.add(24L);
		prices.add(9L);
		System.out.println("prices list:"+prices);
		Set<Long> uniquePrices=new HashSet(prices);
		//2nd way to create set
		//Set<Double> uniquePrices=new HashSet();
//		for (Long each : prices) {
//			uniquePrices.add(each);
//			
//		}
		//sorted set is sorted and has unique elements
		SortedSet<Long> sSet=new TreeSet(uniquePrices);
		
		System.out.println("set of prices: "+uniquePrices);
		Collections.sort(prices);
		System.out.println("sorted list: "+prices);
		int i=prices.indexOf(5L);
		int j=prices.indexOf(9L);
		System.out.println("sorted set: "+sSet);
		//System.out.println(prices.subList(i, j));
		System.out.println("subset: "+sSet.subSet(11L, 36L));
		SortedSet<Long> tail=sSet.tailSet(11L);
		System.out.println("tailset: "+tail);
		tail.remove(24L);
		System.out.println(tail);
		System.out.println(sSet);
		
	}

}
