import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int lotto = 7;
        int zeroCount = 0;
        int num = 0;
        for(int i = 0 ; i < lottos.length; i++){
            if(lottos[i] != 0){
                for(int j = 0 ; j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        num ++;
                    }
                }
            }
            else{
                zeroCount++;
            }
        }
        
        int maxNum = 0;
        int temp = num + zeroCount;
        maxNum = (temp == 0 || temp == 1) ? 6 : lotto-temp;

        int minNum = 0;
        minNum = (num == 0 || num ==1) ? 6 : lotto - num;

        answer[0] = maxNum; answer[1] = minNum;
        
        return answer;
    }
}
