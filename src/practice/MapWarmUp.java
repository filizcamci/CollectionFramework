package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapWarmUp {

	public static void main(String[] args) {
		Map<String,String> family=new HashMap<>();
		family.put("father", "John");
		family.put("mother", "Mary");
		family.put("sister", "Jessie");
		family.put("brother", "Zack");
		family.put("dog", "Kely");
		System.out.println("there are "+family.size()+" body in the family");
		Set<Entry<String,String>> iter=family.entrySet();
		for(Entry<String,String> body: iter) {
		System.out.print(body.getKey());
		System.out.print(":"+body.getValue());
		System.out.println();
		}
		System.out.println(family);
	}

}
