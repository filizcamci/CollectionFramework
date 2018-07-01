package day3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedMapPractice2 {
	public static void main(String[] args) {
		//SortedMap<Integer, String> cityMap = new TreeMap<>();
		 Comparator<Integer> keysort = new sortKey();
		 Comparator<Integer> lw=Comparator.comparing(i-> -i);
		 SortedMap<Integer, String> cityMap = new TreeMap<>(lw);
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
		return o2-o1;
	}
}
