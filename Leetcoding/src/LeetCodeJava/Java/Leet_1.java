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

/*
 * class Leet_1 {
    public int[] twoSum(int[] nums, int target){
        // cache the values and their index
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(map.containsKey(difference) && map.get(difference) != i){ // to ensure that an element is used only once
                return new int[]{map.get(difference), i};
            }
        }
        // can't find our result
        return new int[] {-1,-1}; 

    }
 */