package practice;
import java.util.*;
public class StudentRunner {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		
		Student s1=new Student(1,"John");
		Student s2=new Student(7,"Bary");
		Student s3=new Student(7,"James");
		Student s4=new Student(3,"Zack");
		Student s5=new Student(5,"James");
		
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		//System.out.println(students);
		Comparator<Student> idc=new IDComparator();
		Comparator<Student> nc=new NameComparator();
		//Collections.sort(students,idc);
		//System.out.println(students);
		
		//Collections.sort(students, nc);
		//System.out.println(students);
		
		Comparator<Student> bothc=idc.thenComparing(nc);
		Collections.sort(students, bothc);
		//System.out.println(students);

		
		//using lambda
		Comparator<Student> lsc=Comparator.comparing(s->s.id);
		TreeSet<Student> tss=new TreeSet<>(lsc);
		
		//TreeSet<Student> tss=new TreeSet<>(nc.reversed());
		tss.add(s1);
		tss.add(s2);
		tss.add(s3);
		tss.add(s4);
		tss.add(s5);
		System.out.println(tss);
		
	}

}
