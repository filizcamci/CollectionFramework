package practice;
import java.util.*;
public class PersonComparator {

	public static void main(String[] args) {
		List<Person> people=new ArrayList<>();
		Person p1=new Person("Adam",35);
		Person p2=new Person("Mary",33);
		Person p3=new Person("Mark",27);
		Person p4=new Person("Eve",17);
		Person p5=new Person("Mary",53);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		Collections.sort(people);
		System.out.println(people);
	}

}
