package day3;

public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person p) {
		// return this.name.compareTo(p.name);//this line compares two person objects
		// according to their names ascending order
		// return this.age-p.age; //this line compares two person objects according to
		// their ages
		// return p.name.compareTo(this.name); //this line compares two person objects
		// according to their names descending order
		// Descending
//		int n = p.name.compareTo(this.name);
//		int a = p.age - this.age;
//
//		if (!this.name.equals(p.name))
//			return n;
//		else
//			return a;
		if(this.name.equals(p.name))
			return p.age-this.age;
		else
			return this.name.compareTo(p.name);
		
	}

	/*
	 * Charles's idea:
	 * 
	 * @Override public int compareTo(Person o) { //Ascending //int n =
	 * this.name.compareTo(o.name);
	 * 
	 * //Descending int n = o.name.compareTo(this.name);
	 * 
	 * //Ascending //int a = this.age - o.age;
	 * 
	 * //Descending int a = o.age - this.age;
	 * 
	 * if(!this.name.equals(o.name)) return n; else return a;
	 * 
	 * }
	 */

}
