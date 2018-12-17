package mentoring;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WarmUp {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    
    //System.out.println(map.isEmpty());
    
    map.put("United States", 46);
    map.put("Great Britain", 27);
    map.put("China", 26);
    map.put("Russia", 19);
    
  
    
    //System.out.println(map.size());
    
    Set<Map.Entry<String, Integer>> mapEntrySet = map.entrySet();
    //System.out.println(mapEntrySet);
    
    Set<String> mapKeySet = map.keySet();
    //System.out.println(mapKeySet);
    
    Collection<Integer> mapValue = map.values();
    //System.out.println(mapValue);
    
    
    String country = "";
    int max = 0;
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if(max < entry.getValue()) {
        max = entry.getValue();
        country = entry.getKey();
      }
    }
    System.out.println(country + " " + max);
    
  }
}

