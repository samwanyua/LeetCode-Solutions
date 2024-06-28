

import java.util.LinkedList;
import java.util.List;

public class Leet_763 {
    class Solution{
        public List<Integer> partitionLabels(String S){
            char[] arr = S.toCharArray();
            int[] cache = new int[128];
            for(int i = 0; i < arr.length; i++){
                char currentChar = arr[i];
                cache[currentChar] = i;

            }
            int left = 0, right = 0, index = 0;
            List<Integer> result = new LinkedList<>();
            while(index < arr.length){
                char currentChar = arr[index];
                right = Math.max(right, cache[currentChar]); // last appearance
                if(right == index){
                    int size = right - left + 1;
                    result.add(size);
                    right++;
                    left = right;
                }
                index++;
            }
            return result;
        }
    }
}
