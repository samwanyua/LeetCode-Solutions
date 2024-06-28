

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Base case
        List<List<Integer>> res = new LinkedList<>();
        if(nums.length < 3) return res;

        // Sort the array
        Arrays.sort(nums);

        // Iterate the array
        for(int i = 0; i < nums.length; i++){
            // define cases 
            if(i != 0 && nums[i] == nums[i -1]) continue;
            // pointers
            int left = i + 1, right = nums.length -1;
            while(left < right){
                int currentSum = nums[i]  + nums[left] + nums[right];
                if(currentSum == 0){
                    // add the element to the list
                    List<Integer> subList = new LinkedList<>();
                    subList.add(nums[i]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    res.add(subList);
                    left++;
                    right--;
                    // check if the current is not equal to the previous element
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }

                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }

                }
                else if(currentSum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;

    
        
    }
}
}
