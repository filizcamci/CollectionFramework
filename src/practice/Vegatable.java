package practice;

public class Vegatable {
	public String name;
	public int price;
	
	public Vegatable(String name,int price) {
		this.name=name;
		this.price=price;
	}
	@Override
	public int hashCode() {
		return 55;
	}
	@Override
	public boolean equals(Object obj) {
		Vegatable v=(Vegatable) obj;
		return this.name.equalsIgnoreCase(v.name);
	}
	@Override
	public String toString() {
		String str="name: "+this.name+";"+ "price:$"+ this.price;
		return str;
	}
	
	
}
