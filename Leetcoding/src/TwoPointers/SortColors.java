package TwoPointers;

public class SortColors {
    class Solution {
        public void sortColors(int[] nums) {
            int left = 0, right = nums.length -1, currentPointer = 0;
            while(currentPointer <= right){
                if(nums[currentPointer] ==2){
                    swap(nums, currentPointer, right);
                    right--;
                }
                else if(nums[currentPointer] == 1){
                    currentPointer++;
                }
                else{
                    swap(nums, currentPointer, left);
                    left++;
                    currentPointer++;
                }
            }
        }

        private void swap(int []nums, int p1, int p2){
            int temp = nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = temp;
        }
        
    }
}

