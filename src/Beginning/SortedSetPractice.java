package Beginning;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {
	public static void main(String[] args) {

		SortedSet<String> sSet = new TreeSet<>();
		sSet.add("pear");
		sSet.add("apple");
		sSet.add("orange");
		sSet.add("banana");
		System.out.println(sSet);
		System.out.println(sSet.first());
		System.out.println(sSet.tailSet("orange"));
		System.out.println(sSet.tailSet("oranges"));
		System.out.println(sSet.headSet("orange"));
		System.out.println(sSet.headSet("oranges"));
		System.out.println(sSet.subSet("banana", "orange"));
		
		// try other methods for sSet.
		// sSet.add("1pear");
		// sSet.add("apple");
		// sSet.add("apple2");
		// sSet.add("banana");
		SortedSet<String> strs = new TreeSet<>();
		strs.add("abc");
		strs.add("cty");
		strs.add("gth");
		strs.add("jki");
		strs.add("oiu");
		System.out.println(strs);
		System.out.println(strs.subSet("c", "o"));
		System.out.println(strs.headSet("j"));
		System.out.println(strs.tailSet("l"));
		//comparator interface
	}
}
