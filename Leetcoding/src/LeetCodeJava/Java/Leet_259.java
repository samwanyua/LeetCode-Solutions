

import java.util.Arrays;

public class Leet_259 {
    class Solution{
        public int threeSumSmaller(int [] nums, int target){
            Arrays.sort(nums);

            int counter = 0;
            for(int i = 0; i < nums.length; i++){
                int left = i + 1, right = nums.length -1;
                while(left < right){
                    int currentSum = nums[left] + nums[right] + nums[i];
                    if(currentSum < target){
                        counter += right - left;
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
            return counter;
        }
    }
}
