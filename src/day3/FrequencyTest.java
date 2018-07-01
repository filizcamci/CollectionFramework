package day3;

import java.util.HashMap;
import java.util.Map;

public class FrequencyTest {
public static void main(String[] args) {
	String str="avshfoandfagsnajbnghytdbavbgf";
	Map<Character, Integer> chars=new HashMap<>();
	
	//task: create a frequency table using map
	for(int i=0; i<str.length(); i++) {
		if(!chars.containsKey(str.charAt(i))) {
		chars.put(str.charAt(i), 1);
	}else {
		int count=chars.get(str.charAt(i));
		//chars.put(str.charAt(i), ++count);
		chars.put(str.charAt(i), count+1);
	}
	}
	System.out.println(chars);
}
}
