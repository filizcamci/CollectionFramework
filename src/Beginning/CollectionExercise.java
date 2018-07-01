package Beginning;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExercise {
	public static void main(String[] args) {
		Collection<String> str1 = new ArrayList<>();
		str1.add("apple");
		str1.add("banana");
		str1.add("orange");
//Arrays.asList("aa","bb"); this creates an unmodifiable  list 
		Collection<String> str2 = new ArrayList<>();
		str2.add("melon");
		str2.add("kiwi");
		str1.addAll(str2);
		System.out.println(str1);
		Collection<String> str3 = new ArrayList<>();
		str3.add("apple");
		str3.add("banana");
		str3.add("orange");
		str3.add("pear");
		str3.add("cherry");
		str1.retainAll(str3);
		System.out.println(str1);

	}
}
