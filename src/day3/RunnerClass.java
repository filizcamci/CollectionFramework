package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnerClass {
public static void main(String[] args) {
	List<Student> students = new ArrayList<>();
	students.add(new Student(11,"Adam"));
	students.add(new Student(26,"Dave"));
	students.add(new Student(26,"John"));
	students.add(new Student(13,"Zack"));
	students.add(new Student(4,"Bob"));
	System.out.println(students);
	
	//Collections.sort(students);//this line does not compile because student is not comparable
	Comparator<Student> idcomp=new IdComparator();
	Collections.sort(students, idcomp);
	System.out.println(students);
	
	Comparator<Student> namecomp=new ReversedNameComparator();
	Collections.sort(students, namecomp);
	System.out.println(students);
	 Comparator<Student> bothCom = idcomp.thenComparing(namecomp);
	//  Collections.sort(students,bothCom);
	//  System.out.println(students);
	  
	 //comparing using lambda
	  Comparator<Student> lCom = Comparator.comparing(s-> s.getId());
	  Comparator<Student> nCom = Comparator.comparing(p-> p.getName());
	  
	  Collections.sort(students,nCom.reversed());
	  System.out.println(students);
	  
	  //TreeSet<Student> ts = new TreeSet<>();
	  
	  
	  
}
}
