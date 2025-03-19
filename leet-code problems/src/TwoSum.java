import java.util.*;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int[] nums = {2, 7, 11, 15};
      int target = 9;
      TwoSum ts = new TwoSum();
      int[] result = ts.twoSum(nums, target);
      System.out.println("[" + result[0] + ", " + result[1] +"]");
      input.close();
    }
}
