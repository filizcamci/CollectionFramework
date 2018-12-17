package mentoring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  
  public static void main(String[] args) {
    int[] num = {2, 11, 15, 7};
    int target = 9;
    
    System.out.println(Arrays.toString(twoSum(num, target)));
    
  }
  
  public static int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    
    Map<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < numbers.length; i++) {
      if(map.containsKey(target-numbers[i])) {
        result[0] = map.get(target-numbers[i]);
        result[1] = i;
        
        return result;
      }
      map.put(numbers[i], i);
    }
    return result;
  }
  
}

