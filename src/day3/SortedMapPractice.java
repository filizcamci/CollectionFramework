package day3;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortedMapPractice {
public static void main(String[] args) {
	Map<Integer, String> cityMap=new HashMap<>();
	cityMap.put(21345, "Detroit");
	cityMap.put(78729, "Austin");
	cityMap.put(43566, "Rochester");
	System.out.println(cityMap);
	
	//Map is not iterable
	//in order to iterate through a map we need collection view
	//map.keyset()  map.values()  map.entryset()  give view
	
	//key:value view
	Set<Entry<Integer,String>> iter=cityMap.entrySet();
	//Set<Entry<Integer, String>> entries = cityMap.entrySet();
	for (Entry<Integer, String> each : iter) {

		System.out.print(each.getKey() + "  ");
		System.out.println(each.getValue());
	}
	
	
	//key view of the citymap:
	//Set<Integer> keyView=cityMap.keySet();
	//for(Integer key:keyView) {
	for(Integer key:cityMap.keySet()) {
		System.out.println("map key: "+key);
	}
	
	//value view:
	Collection<String> valueView=cityMap.values();
	for(String value: cityMap.values()) {
		System.out.println("map value: "+value);
	}
}
}
