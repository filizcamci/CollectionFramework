package Beginning;

import java.util.*;

public class ListImplementation {
public static void main(String[] args) {
	//List<Integer> myList=new ArrayList();
	Collection<Integer> myList=new ArrayList();
	myList.add(new Integer(1));
	myList.add(new Integer(5));
	myList.add(new Integer(4));
	myList.add(new Integer(7));
	myList.add(new Integer(5));
	System.out.println(myList);
	myList.remove(1);// removes item at index 1
	System.out.println(myList);
	myList.remove(new Integer(1));// removes item with value 1
	System.out.println(myList);
	for(Integer e:myList) {
		System.out.println(e);
	}
	List<Integer>lst=Arrays.asList(22,44,56);
	myList.addAll(lst);
	System.out.println(myList);
	List<Integer>lst2=Arrays.asList(22,44);
	myList.removeAll(lst2);
	System.out.println(myList);
	
	
}
}
