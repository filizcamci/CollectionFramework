package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class IterPractice {

	public static void main(String[] args) {
		Collection<String> veggies = new ArrayList<>();
		veggies.add("cabbage");
		veggies.add("lettuce");
		veggies.add("carrot");
		veggies.add("cucumber");
		veggies.add("parsley");
		List<String> vegs = Arrays.asList("tomatoes", "cucumber", "carrot");
		System.out.println(veggies);
		 veggies.retainAll(vegs);
		 System.out.println(veggies);
		veggies.addAll(vegs);
		System.out.println(veggies);

		System.out.println(veggies);
		Iterator<String> iter = veggies.iterator();
		System.out.println(iter.next() + " deleted");
		iter.remove();
		System.out.println(veggies);

		Set<String> uniqueVeggies = new HashSet<>(veggies);
		System.out.println(uniqueVeggies);

		Iterator<String> iter2 = uniqueVeggies.iterator();
		 while(iter2.hasNext()) {
		 if(iter2.next().length()>6)
		 iter2.remove();
		 }
		 System.out.println(uniqueVeggies);
		 SortedSet<String> sortedUniqueVeggies = new TreeSet<>(veggies);
		 System.out.println(sortedUniqueVeggies);

		

	}

}
