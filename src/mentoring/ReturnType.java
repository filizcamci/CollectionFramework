package mentoring;

interface Count{
	int count(int i, int j, int r);
}
interface Concat{
	String concat(String str1, String str2);
}
public class ReturnType {

	public static void main(String[] args) {
		
		//Count add = (int i, int j) -> { return i+j; };
        Count mult = (int i, int j, int r) ->{ return i*j+r-i+j; }; 
        
       //System.out.println( add.count(2, 5));
       System.out.println( mult.count(2, 5, 1));
       
       Concat concat = (String str1, String str2) ->  { return str1 + str2; }; 
       String s = concat.concat("A", "B");
       System.out.println(s);
	}


}
