package practice;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		int n=1;
		Scanner input=new Scanner(System.in);
		System.out.println("please enter names");
		for(int i=0; i<6; i++) {
			names.add(input.next());
		}
		//String name=input.next();
//		while(input.hasNext()) {
//			names.add(name);
//			if(name.equals("q"))
//				break;
//		}
		System.out.println("there are "+names.size()+ " names: ");
		Set<String> un=new HashSet<>(names);
		Map<String,Integer> freMap=new HashMap<>();
		System.out.println("there are "+un.size()+" unique names");
		for(String uname:un) {
			int f=Collections.frequency(names, uname);
			System.out.println("name "+ uname+" appears "+f+" times");
			freMap.put(uname, f);
			
		}
		System.out.println("============================");
		System.out.println(freMap);
		String s="agdbfkhgabhglddacjdgd";
		
		System.out.println(freqMap(s));
		
		

	
		
	}
	public static Map<Character,Integer> freqMap(String str){
		Map<Character,Integer> frm=new HashMap<>();
		char[] chars=str.toCharArray();
		int k=0;
		for(int i=0;i<str.length();i++) {
			
			if(!frm.containsKey(str.charAt(i))){
				frm.put(str.charAt(i), 1);
			}else {
				frm.put(str.charAt(i), frm.get(str.charAt(i))+1);
			}
			
			
		}
		
		return frm;
	}

}
