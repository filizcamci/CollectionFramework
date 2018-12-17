package day3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedMapPractice2 {
	public static void main(String[] args) {
		// SortedMap<Integer, String> cityMap = new TreeMap<>();
		Comparator<Integer> keysort = new sortKey();

		// lambda way:
		Comparator<Integer> lw = Comparator.comparing(i -> -i);
		SortedMap<Integer, String> cityMap = new TreeMap<>(lw);

		/*this is great:
		 * Comparator<Integer> lci = (Integer o1, Integer o2) -> Integer.compare(o1,
		 * o2); // with lambda SortedMap<Integer, String> cityMap = new
		 * TreeMap<>(lci.reversed()); 
		 * // or this one 
		 * Comparator<Integer> lci2 = (Integer
		 * o1, Integer o2) -> { return o2 - o1; }; SortedMap<Integer, String> cityMap =
		 * new TreeMap<>(lci2);
		 */
		
		
		// SortedMap<Integer, String> cityMap = new TreeMap<>(keysort);
		cityMap.put(12, "Alexandria");
		cityMap.put(5, "Arlington");
		cityMap.put(77, "FallsChurch");
		cityMap.put(3, "Fairfax");
		System.out.println(cityMap);

	}
}

class sortKey implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}
