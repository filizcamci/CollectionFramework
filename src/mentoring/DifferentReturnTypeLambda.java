package mentoring;

interface Count1{
	int calculate(int i, int j, int k);
}
interface Print{
	String print(String str);
}
interface Print2{
	String print2(String str, String str2);
}
public class DifferentReturnTypeLambda {

	public static void main(String[] args) {

		Count1 addition = (i,j,k) -> i+j+k;
		System.out.println(addition.calculate(100, 120, 130));
		
		Count1 division = (i,j,k) -> i/j/k;
		System.out.println(division.calculate(16, 4, 2));
         
		Count1 count = (i,j,k) -> i-j*k;
		System.out.println(count.calculate(100, 22, 2));

		Print name = str -> { return "Say Hello to "+ str;};
		System.out.println(name.print("John"));
		
		Print2 name2 = (String str, String str2) -> {return str +" and "+ str2 + " are good friends"; };
		System.out.println(name2.print2("Vaso ", "Mustafa"));
		
	}

}
