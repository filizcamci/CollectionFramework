package practice;

public class Person implements Comparable<Person> {
	public String name;
	public int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Person o) {
		if(this.name.equals(o.name))
			return this.age-o.age;
		else
			
		return this.name.compareTo(o.name);
		//return o.name.compareTo(this.name);
		//return this.age-o.age;
		
		
	}
	@Override
	public String toString() {
		return this.name+" : "+this.age;
	}
}
