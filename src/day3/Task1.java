package day3;

import java.util.*;
import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	List<String> names=new ArrayList();
	Scanner input=new Scanner(System.in);
	for(int i=0; i<10;i++) {
	System.out.println("please enter a name");
	String name=input.next();
	names.add(name);
	}
	System.out.println(names);
	Set<String> uniqueNames=new HashSet(names);
	System.out.println("there are "+uniqueNames.size()+" unique names");
	
	for(String eachname:uniqueNames) {
	System.out.println(Collections.frequency(names, eachname));
	}
	
//	for(String each:uniqueNames) {
//		int count=0;
//		for(String eachname:names) {
//			if(each.equals(eachname))
//				count++;
//		}
//	}
}
}
