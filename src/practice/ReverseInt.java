package practice;

import java.util.Comparator;

public class ReverseInt implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		//return o2-o1;
		return Integer.compare(o2, o1);
	}

}
