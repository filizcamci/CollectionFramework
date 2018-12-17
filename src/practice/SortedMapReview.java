package practice;

import java.util.*;

public class SortedMapReview {

	public static void main(String[] args) {
		Comparator<Integer> rs=new ReverseInt();
		Comparator<Integer> ri=Comparator.comparing(i->-i);
		
		//SortedMap<Integer,String> cityMap=new TreeMap<>(rs);
		SortedMap<Integer,String> cityMap=new TreeMap<>(ri);
		
		cityMap.put(112, "Rochester");
		cityMap.put(114, "Seattle");
		cityMap.put(111, "Detroit");
		cityMap.put(113, "Austin");
		
		System.out.println(cityMap);
		
	}

}
