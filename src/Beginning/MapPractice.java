package Beginning;

import java.util.*;

public class MapPractice {
public static void main(String[] args) {
	//HashMap<Integer,String> myMap=new HashMap<>();
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "soccer");
	map.put(2, "basketball");
	map.put(3, "tennis");
	System.out.println(map);
	
	Map<Double,String> dsmap=new HashMap();
	//adding item to map
	dsmap.put(2.4, "apple");
	dsmap.put(2.4, "orange");
	dsmap.put(2.6, "pear");
	dsmap.put(2.8, "banana");
	System.out.println(dsmap);
	//key must be unique, it overrides the value in case of duplicate key
	//getting item by key
	
	System.out.println(map.get(1));
	System.out.println(dsmap.get(2.6));
	
	//checking if the key exists
	System.out.println(map.containsKey(5));
	
	//checking if the value exists
	System.out.println(map.containsValue("football"));
	
	//if we try to get a value/key does not exist
	System.out.println(map.get(6));
	
	//counting the items in a map
	System.out.println(map.size());
	map.remove(2);
	System.out.println(map);
	map.replace(3, "football");
	System.out.println(map);
	map.replace(1, "soccer", "baseball");
	System.out.println(map);
	map.putIfAbsent(2, "golf");
	System.out.println(map);


	
	
}
}
