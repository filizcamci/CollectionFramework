package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingObjects {
public static void main(String[] args) {
	List<String> names=Arrays.asList("Adam","Zack","Bobby","Dave","Bob");
	Collections.sort(names);
	System.out.println(names);
	List<Person> people = new ArrayList<>();
	people.add(new Person("Adam" , 22));
	people.add(new Person("Dave" , 62));
	people.add(new Person("Adam" , 32));
	people.add(new Person("Bob" , 42));
	System.out.println(people);
	
	Collections.sort(people);
	
	System.out.println(people);
	
}
}
