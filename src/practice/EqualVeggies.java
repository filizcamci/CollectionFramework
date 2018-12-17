package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;



public class EqualVeggies {
	public static void main(String[] args) {
		
		Set<Vegatable> vegatables=new HashSet<>();
		vegatables.add(new Vegatable("cabbage", 7));
		vegatables.add(new Vegatable("lettuce", 5));
		vegatables.add(new Vegatable("parsley", 2));
		vegatables.add(new Vegatable("onion", 7));
		vegatables.add(new Vegatable("cabbage", 8));
		//System.out.println(vegatables);
		Iterator<Vegatable> iterv=vegatables.iterator();
		while(iterv.hasNext()) {
			System.out.println(iterv.next());
		}
	}
}
