import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = -1;

        int count = 0;
        int sum = 0;
        
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i+1 ; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    sum += nums[i] + nums[j] + nums[k];
                    //판별
                    
                    int l = 2;
                    boolean result = true;
                    while(l < sum){
                        if(sum % l == 0){
                            result = false;
                            break;
                        }
                        l++;
                    }
                    if(result == true){
                        count++;
                    }
                    
                    sum =0;
                }
            }
        }

        return answer = count;
    }

    
   
}
