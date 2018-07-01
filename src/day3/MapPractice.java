package day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {
public static void main(String[] args) {
	List<String> names=Arrays.asList("Adam","Adam","Bob","Dave","Bob","Bob","Adam");
	Map<String, Integer> namesMap=new HashMap<>();
//	for(String each:names) {
//		namesMap.put(each,0);
//		
//	}
//	System.out.println(namesMap);
	
	for(String each:names) {
		
		if(!namesMap.containsKey(each)) {
			namesMap.put(each, 1);
		}else {
			int count=namesMap.get(each);
			namesMap.put(each, count+1);
		}
		
	}
	System.out.println(namesMap);
	
}
}
