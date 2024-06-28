package Easy;


import java.util.Arrays;

public class Leet_16 {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int gap = Integer.MAX_VALUE, answer = 0;

            for(int i = 0; i< nums.length; i++){
                int left = i + 1, right = nums.length -1;
                while(left < right){
                    int currentSum = nums[left] + nums[right] + nums[i];
                    if(currentSum == target){
                        return target;
                    }
                    else if(currentSum < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                    int currentGap = Math.abs(currentSum - target);
                    if(currentGap < gap){
                        gap = currentGap;
                        answer = currentSum;
                    }
                    
                }

            }
            return answer;
            
        }
    }
}
