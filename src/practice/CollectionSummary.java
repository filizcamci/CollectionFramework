package practice;

import java.util.*;


public class CollectionSummary {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<>();
		List<String> n=new ArrayList();
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(-3);
		arr.add(1);
		arr.add(4);
		//Collections.fill(arr, 3);
		System.out.println(arr);
		Collections.shuffle(arr); //it changes the order every time
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		System.out.println(	Collections.binarySearch(arr, 1));
		System.out.println(Collections.frequency(arr, 1));
		int freq=0;
		for(Integer i: arr) {
			if(i==1)
				freq++;
		}
		System.out.println(freq);



	}

}
