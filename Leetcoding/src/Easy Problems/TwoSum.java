import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(numbers.containsKey(target - nums[i])){
                return new int [] {i, numbers.get(target - nums[i])};
            }
            numbers.put(nums[i], i);
        }
        return new int[0];
    }
}
