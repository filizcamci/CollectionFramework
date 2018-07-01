package day3;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTask {
public static void main(String[] args) {
	/*
	 * Task : 
	 * Create a TreeSet of Students 
	 * Add 5 students (you can copy previous ones)
	 * Print out and see what you get 
	 * Create a TreeSet of Students 
	 *  by passing Comparator that 
	 *    sort by ID asc and name desc
	 *  then print out the tree Set 
	 * 
	     */
	
	//lambda way:
	
	//Comparator<Student> sortid = Comparator.comparing( std-> std.getid()) ; 
	
	
	Comparator<Student> namesort = new sortName();
	 //TreeSet<Student> sTree = new TreeSet<>(namesort);
	 Comparator<Student> idsort = new sortId();
	 TreeSet<Student> sTree = new TreeSet<>(idsort);
	 Comparator<Student> bothCom = idsort.thenComparing(namesort);    
	   // TreeSet<Student> sTree = new TreeSet<>(bothCom);
	 sTree.add(new Student(11,"Adam")); 
	 sTree.add(new Student(45,"John")); 
	 sTree.add(new Student(23,"Eve")); 
	 sTree.add(new Student(11,"Marry")); 
	 sTree.add(new Student(51,"Zack")); 
	    
	    System.out.println(sTree);
	   
	    
	   
}
}
class sortName implements Comparator<Student> {

	  @Override
	  public int compare(Student o1, Student o2) {
	    
	    /// getting last character as String 
	    /// using comparedTo method of String to get reversedOrder
	    return  o2.getName().compareTo(o1.getName())  ;
	  }
}
class sortId implements Comparator<Student> {

	  @Override
	  public int compare(Student o1, Student o2) {
	    
	    /// getting last character as String 
	    /// using comparedTo method of String to get reversedOrder
	    return  o1.getId()-o2.getId()  ;
	  }
}
