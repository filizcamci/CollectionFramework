package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class PlayWithMap {

	public static void main(String[] args) {
		Map<String,String> myPlaces=new HashMap<>();
		
		myPlaces.put("Colombus", "OH");
		myPlaces.put("Detroit", "MI");
		myPlaces.put("Rochester", "NY");
		myPlaces.put("Austin", "TX");
		myPlaces.put("Seattle", "WA");
		System.out.println(myPlaces);
		Set<String> ucities = myPlaces.keySet();
		System.out.println("unsorted cities:");
		int num=1;
		for(String city: ucities) {
			System.out.println("city "+num+" : "+city);
			
		}
		
		System.out.println("==========================================================");
		SortedMap<String,String> sortedPlaces=new TreeMap<>(myPlaces);
		System.out.println(sortedPlaces);
		System.out.println("sorted cities:");
		Set<String> cities=sortedPlaces.keySet();
		num=1;
		for(String city: cities) {
			System.out.println("city "+ num+" : "+city);
			num++;
		}
		
		
		
		Set<Entry<String,String>> cvss=sortedPlaces.entrySet();
		System.out.println("city \t state");
		for(Entry<String,String> each: cvss) {
			System.out.println(each.getKey()+" : "+each.getValue());
		}

	}

}
