import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int pick = nums.length/2;
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length; i++){
            set.add(nums[i]);
        }

        
        return answer = (set.size()>=pick) ? pick : set.size();
    }
}
