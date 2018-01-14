import java.util.HashMap;
import java.util.Arrays;

public class twoSumTest {
  public static int[] twoSum(int[] nums, int target) {
      int[] result;
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      for (int i = 0; i < nums.length; i++ ) {
        if (map.containsKey(target - nums[i])) {
          result = new int[] {map.get(target - nums[i]), i};
          return result;
        }
        map.put(nums[i], i);
      }
      return new int[]{};
  }
  public static void main(String args[]) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = twoSum(nums, target);
    System.out.println("result: " + Arrays.toString(result));
  }
}
