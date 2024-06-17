public package HashTables;

import java.util.HashMap;

class TwoSum {
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
    
}