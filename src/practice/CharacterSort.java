package practice;

import java.util.*;
public class CharacterSort {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("pear");
		fruits.add("banana");
		fruits.add("kiwi");
		
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);
		
		
		Comparator<String> reversedSort=Comparator.comparing(s->s.length());
		SortedSet<String> uniqueFruits=new TreeSet<>(reversedSort);
		uniqueFruits.add("banana");
		uniqueFruits.add("apple");
		uniqueFruits.add("strawberry");
		uniqueFruits.add("tangerine");
		uniqueFruits.add("kiwi");
		uniqueFruits.add("pomegranate");
		System.out.println(uniqueFruits);
		
		
		
		
		
		
	}

}
