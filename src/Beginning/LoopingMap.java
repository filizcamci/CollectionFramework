package Beginning;

import java.util.*;

public class LoopingMap {
public static void main(String[] args) {
	Map<String, String> jobMap=new HashMap();
	jobMap.put("SDET", "Vienna");
	jobMap.put("DBA", "Fairfax");
	jobMap.put("ScrumMaster", "DC");
	jobMap.put("ProductOwner", "Fairfax");
	
	System.out.println(jobMap);
	Set<String> keys=jobMap.keySet();
	
	for (String key : keys) {
		System.out.println(key);
	}
	
	Iterator<String> iter=keys.iterator();
	while(iter.hasNext()) {
		System.out.print(iter.next()+" - ");
	}
	System.out.println();
	keys.remove("DBA");
	System.out.println(jobMap);
	Collection<String> allValues=jobMap.values();
	Iterator<String> it=allValues.iterator();
	while(it.hasNext()) {
		it.next();
	}
	allValues.remove("Fairfax");
	System.out.println(jobMap);
}
}
